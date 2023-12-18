import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int r =0;
		for(int i=0;i<a;i++) {
			int x =sc.nextInt();
			int y= sc.nextInt();
			if(Math.sqrt(x*x+y*y)<=b) {
				r++;
			}
		}
		System.out.println(r);
		

	}

}



