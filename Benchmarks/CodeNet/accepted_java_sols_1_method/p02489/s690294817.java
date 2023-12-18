import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args)throws IOException{
		int a;
		int i=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while((a=Integer.parseInt(br.readLine()))!=0){
			System.out.println("Case "+i+": "+a);
			i++;
		}
	}
}