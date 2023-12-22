import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//数値
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int ba = b-a;
		int B = 0;
		for(int i = ba; i > 0; i--){
            	B += i;
            }
		 System.out.println(B-b);
     }
}