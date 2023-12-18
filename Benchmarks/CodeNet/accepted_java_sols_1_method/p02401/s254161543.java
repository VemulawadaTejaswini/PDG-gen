import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){

			String[] imputarray = br.readLine().split(" ");
			int a = Integer.parseInt(imputarray[0]);
			int b = Integer.parseInt(imputarray[2]);
			if(  imputarray[1].equals("+") ){
				System.out.println(a+b);
			}else if( imputarray[1].equals("-")){
				System.out.println(a-b);
			}else if( imputarray[1].equals("*")){
				System.out.println(a*b);
			}else if( imputarray[1].equals("/")){
				System.out.println(a/b);
			}else break;
		}
	}
}