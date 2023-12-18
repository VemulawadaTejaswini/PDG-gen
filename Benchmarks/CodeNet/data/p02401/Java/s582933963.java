
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


	public static void main(String[] args){


		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		

		String op;
		int n ;
		int n2;
		int r=0;
		for(;;){
			try {
				String[] arr = br.readLine().split(" ");
			
			
			
			op = arr[1];
			n = Integer.parseInt(arr[0]);
			n2 = Integer.parseInt(arr[2]);
			if("?".equals(op)){
				break;
			}else{
				switch(op){
				
				case("+"):
					r=n+n2;
				case("-"):
					r=n-n2;
				case("*"):
					r=n*n2;
				case("/"):
					r=n/n2;
				
				}
			System.out.println(r);
			}
			} catch (IOException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
		
		}
	}
}