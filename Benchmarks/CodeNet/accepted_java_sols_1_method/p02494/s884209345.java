import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] t;
		while((s=r.readLine())!=null){
			t=s.split(" ");
			int h=Integer.parseInt(t[0]);
			int w=Integer.parseInt(t[1]);
			if(h==0&&w==0){
				System.exit(0);
			}
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}