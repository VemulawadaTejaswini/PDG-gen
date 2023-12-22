import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();
		int cnt=0;
		int check=0;
		while(true) {
			for(int i=0;i<n;i++) {
				if(a[i]%2!=0) {
					check=1;
					break;
				}
			}
			if(check==1)break;
			else {
				cnt++;
				for(int i=0;i<n;i++) {
					a[i]/=2;
				}
			}
		}
		System.out.println(cnt);
	}

}