import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int init = (int)('a');
		int[] count = new int[(int)('z') - init + 1];
		int _t;
		try{
			line = reader.readLine();
			for(int i=0, l=line.length(); i<l; i++){
				//System.out.print((int)(Character.toLowerCase((line.charAt(i))))+" ");
				_t = (int)(Character.toLowerCase((line.charAt(i)))) - init;
				if(_t>=0){
					count[_t] ++;
				}
			}
			for(int i=0, l=count.length; i<l; i++){
				System.out.println(String.valueOf((char)(i+init))+" : "+count[i]);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}