import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class Main {
    public static void main(String[] arg)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int a ,b;
		String str = br.readLine();
		String strARY[] = str.split(" ");
		a= Integer.parseInt(strARY[0]);
		b = Integer.parseInt(strARY[1]);
		
		if(a>b){
			System.out.println("a > b");
		}else if(a<b){
			System.out.println("a < b");
		}else{
			System.out.println("a == b");
		}
    }
}