import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		Long A = sc.nextLong();
		if(A==0){
			System.out.println("0");
			return;
		}
		String str = sc.next();
		str = str.replace(".", "");
		Long B = Long.valueOf(str);
		A *= B;
      	if(A<100){
         	System.out.println("0");
			return;
        }
      	
		String ans = String.valueOf(A);
		int len = ans.length();
		System.out.println(ans.substring(0, len-2));
		return;
	}
}