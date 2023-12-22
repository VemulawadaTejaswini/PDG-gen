
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {


	public static void main(String[] args){
		int a = 0;
		int b = 0;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				String[] arr = br.readLine().split(" ");
				
				a = Integer.parseInt(arr[0]);
				b = Integer.parseInt(arr[2]);
				String op = arr[1];
				
				if("+".equals(op)){
					System.out.println(a+b);
				}else if("-".equals(op)){
					System.out.println(a-b);
				}else if("*".equals(op)){
					System.out.println(a*b);
				}else if("/".equals(op)){
					System.out.println(a/b);
					
				}else{
					break;
				}
				
				
			}
		}catch(IOException e){
			
		}

	}
}