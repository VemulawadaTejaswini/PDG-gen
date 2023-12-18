package Class01;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		double a1 = Math.ceil((double)a/(double)c);
		double a2 = Math.ceil((double)b/(double)d);
		int e;
		if(a1>a2){
			e = (int)a1;
		}else if(a1 == a2){
			e = (int)a2;
		}else{
			e = (int)a2;
		}
		int ans = l - e;
		
		System.out.println(ans);
	}

}