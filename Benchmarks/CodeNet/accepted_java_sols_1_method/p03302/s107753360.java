import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO 自動生成されたメソッド・スタブ
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String[] line = br.readLine().split(" ");
	        int a = Integer.parseInt(line[0]);
	        int b = Integer.parseInt(line[1]);

	        if(a+b==15){
	            System.out.println("+");
	        }else if(a*b==15){
	            System.out.println("*");
	        }else{
	            System.out.println("x");
	        }
	}

}
