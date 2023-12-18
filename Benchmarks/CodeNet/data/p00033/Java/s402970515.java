import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int d=0;d<n;d++) {
			int b = 0;
			int c = 0;
			boolean ans = true;
			for(int i=0;i<10;i++) {
				int a = sc.nextInt();
				if(b>c) {
					if(a>b) {
						b=a;
					}else if(a>c){
						c=a;
					}else{
						ans = false;
						break;
					}
				}else{
					if(a>c) {
						c=a;
					}else if(a>b){
						b=a;
					}else{
						ans = false;
						break;
					}
				}
			}
			System.out.println(ans ? "YES" : "NO");
		}
		sc.close();
	}
}