import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n<1) return;
			n=n<2?2:n;
			int s = 1;
			for(int i=2;i*i<=n;i++){
				if(n%i==0){
					s+=i+n/i;
				}
				if(i*i==n){
					s-=i;
				}
			}
			System.out.println(n==s?"perfect number":n>s?"deficient number":"abundant number");
		}
	}
}