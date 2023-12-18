import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		long V = sc.nextLong();
		int B = sc.nextInt();
		long W = sc.nextLong();
		long T = sc.nextLong();

		long diff = Math.abs(A-B);
		long speed = V-W;

		if(speed*T>=diff){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
    }
}
