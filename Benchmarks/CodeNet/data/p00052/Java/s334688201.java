import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count,n;
		while(sc.hasNext()){
			n=sc.nextInt();
			count=0;
			if(n==0) break;
			while(5<n){
				n/=5;
				count+=n;
			}
			System.out.println(count);
		}
	}
}