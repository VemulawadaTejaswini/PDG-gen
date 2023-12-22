import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s="";
		while((s=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(s," ");
			int x=Integer.parseInt(st.nextToken());
			String ss=st.nextToken();
			if(ss.equals("+")){
				int y=Integer.parseInt(st.nextToken());
				System.out.println(x+y);
			}else if(ss.equals("-")){
				int y=Integer.parseInt(st.nextToken());
				System.out.println(x-y);
			}else if(ss.equals("*")){
				int y=Integer.parseInt(st.nextToken());
				System.out.println(x*y);

			}else if(ss.equals("/")){
				int y=Integer.parseInt(st.nextToken());
				System.out.println(x/y);

			}else{
				break;
			}
		}

	}

}