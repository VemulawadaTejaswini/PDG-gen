import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		int answer = s * t;
      	if(answer >= d){
			System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
	}
}