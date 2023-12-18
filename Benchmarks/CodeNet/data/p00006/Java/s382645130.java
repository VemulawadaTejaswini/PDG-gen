import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		while(true){

			try{
				name=br.readLine();
				StringBuffer sb=new StringBuffer(name);
				name=sb.reverse().toString();
				System.out.println(name);
				name="";
				sb=null;

			}

			catch(Exception e){
				System.exit(0);
			}
		}
	}
}