import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	
	public static void main(String input[]){
		int a = 0, b = 0, c=0;
		BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
		String fileline;
		try{
			while ((fileline = buffRead.readLine()) != null){
				int height = Integer.parseInt(fileline);
				if (height > a){
					c = b;
					b = a;
					a = height;		
				}else if (height > b){
					c = b;
					b = height;
				}else if (height > c){
					c = height;
				}else{
					
				}
			}
		} catch (Exception e){
			System.out.println("Failure");
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}	
}