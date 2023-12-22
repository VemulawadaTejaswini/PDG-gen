import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();
		int point=1,cnt=0;
		int flg=0;
		while(true) {
			point=a[point-1];
			cnt++;
			if(point==2) {
				flg=1;
				break;
			}else if(cnt>=n)break;
		}
		System.out.println((flg==1)? cnt:"-1");
	}
}