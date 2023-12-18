import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int v = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();
		sc.close();
		
		if(v!=w && 0 <= (b-a)/(v-w) && (b-a)/(v-w) <= t){
			System.out.println("YES");
		}else{
			System.out.println("No");
		}
	}
}