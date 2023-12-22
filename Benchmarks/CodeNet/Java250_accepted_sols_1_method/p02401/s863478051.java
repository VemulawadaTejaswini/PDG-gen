import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[]args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=br.readLine())!=null){
			String[] arr=str.split(" ");
			int a=Integer.parseInt(arr[0]);
			int b=Integer.parseInt(arr[2]);
			String op=arr[1];
			if(op.equals("+")){
				System.out.println(a+b);
			}else if(op.equals("-")){
				System.out.println(a-b);
			}else if(op.equals("*")){
				System.out.println(a*b);
			}else if(op.equals("/")){
				System.out.println(a/b);
			}else{
				break;
			}
		}		
		br.close();
	}
}