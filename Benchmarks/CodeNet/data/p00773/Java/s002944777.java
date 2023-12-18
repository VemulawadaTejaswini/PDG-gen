import java.io.IOException;
import java.io.InputStream;

public class Main{
	public static void main(String[] args)throws IOException{
		FastStream fs = new FastStream();
		Main app = new Main();
		String str, s[];
		
		int a, b, c, x, y, max;
		while(!(str = fs.next()).equals("0 0 0")){
			s = str.split(" ");
			a = Integer.valueOf(s[0]);
			b = Integer.valueOf(s[1]);
			c = Integer.valueOf(s[2]);
			
			max = -1;
			for(int i = 1; i < c; i++){
				for(int j = 1; j < c; j++){
					if(app.set(i, a) + app.set(j, a) == c){
						max = Math.max(app.set(i, b) + app.set(j, b), max);
					}
				}
			}
			System.out.println(max);
		}
	}
	
	public int set(int p, int x){
		return p * (100 + x) / 100;
	}
}

class FastStream{
	private final InputStream is = System.in;
	private byte buffer[] = new byte[1024];
	private int i, tmp;
	
	private boolean isChar(int n){ return 32 <= n && n <= 126; };
	public String next()throws IOException{
		StringBuilder sb = new StringBuilder();
		is.read(buffer);
		i = 0;
		tmp = buffer[i++];
		while(isChar(tmp)){
			sb.append((char)tmp);
			tmp = buffer[i++];
		}
		return sb.toString();
	}
}