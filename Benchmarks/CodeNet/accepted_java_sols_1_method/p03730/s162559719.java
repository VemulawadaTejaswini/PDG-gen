import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int g=0;
		for(int i=1;i<=b;i++){
			if(a*i%b==c) {
				g=1;
				break;
			}
		}
		if(g==0)System.out.println("NO");
		else System.out.println("YES");
	}
}