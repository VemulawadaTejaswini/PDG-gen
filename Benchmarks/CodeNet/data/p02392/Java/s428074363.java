import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String num[]=br.readLine().split(" ");
		int a=Integer.parseInt(num[0]);
		int b=Integer.parseInt(num[1]);
		int c=Integer.parseInt(num[2]);
		if(a<b){
		 if(b<c){
			 System.out.print("yes");
		 }
		 else System.out.println("no");
		 
		}
	}
}