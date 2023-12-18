import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if(k%2==0){
			System.out.print((long)(Math.pow(n/k,3)+Math.pow(n/(k/2)-n/k,3)));
		}else{
			System.out.print((long)(Math.pow(n/k,3)));
		}
	}
}
