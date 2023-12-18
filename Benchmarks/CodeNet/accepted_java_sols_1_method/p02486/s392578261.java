import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int n,x;
		Scanner sc = new Scanner(System.in);
		while(true){
			int cnt=0;
			n=sc.nextInt();
			x=sc.nextInt();
			if(n==0 && x==0) break;
			for(int i=1; i<=n; i++){
				for(int j=1; j<=n; j++){
					for(int k=1; k<=n; k++){
						if(i+j+k==x && i<j && j<k) cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}