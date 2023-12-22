import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		int p3 = sc.nextInt();
		int j1 = sc.nextInt();
		int j2 = sc.nextInt();
		int p = p1, j = j1, r;
		
		if(p<=p2){
			if(p3<p) p = p3;
		}else if(p>p2){
			if(p2<=p3) p = p2;
			else if(p3<p2)p = p3;
		}
		if(j2<j)j = j2;
		r = p+j-50;
		System.out.println(r);
	}

}