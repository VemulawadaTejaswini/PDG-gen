import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		d = (int)Math.pow(100,d);
		if(n==100){
			System.out.println(d*(n+1));
		}else{
			System.out.println(d*n);
		}
	}
}