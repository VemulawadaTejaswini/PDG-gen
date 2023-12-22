import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int aka[][]=new int[n][2];
		int ao[][]= new int[n][2];
		for(int i=0;i<n;i++) {
			aka[i][0]=sc.nextInt();
			aka[i][1]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			ao[i][0]=sc.nextInt();
			ao[i][1]=sc.nextInt();
		}

		Arrays.sort(aka, (a, b) -> Integer.compare(a[0], b[0]));
		Arrays.sort(ao, (a, b) -> Integer.compare(a[0], b[0]));


		int count=0;
		boolean used[]= new boolean[n];
		for(int i=0;i<n;i++) {
			used[i]=false;
		}

		for(int i=0;i<n;i++) {
			int k=0;

			for(int j=0;j<n;j++) {
				if(!used[j]){
					k=j;
					break;

				}
			}

			for(int j=k;j<n&&aka[j][0]<ao[i][0];j++) {
				if(!used[j]) {
					if(aka[k][1]<ao[i][1]) {
						if(aka[k][1]<=aka[j][1]&&aka[j][1]<ao[i][1]) {
							k=j;
						}
					}
					else {
						if(aka[j][1]<ao[i][1]) {
							k=j;
						}
					}
				}

			}

			if(!used[k]&&aka[k][0]<ao[i][0]&&aka[k][1]<ao[i][1]){
				used[k]=true;
				count++;
			}
		}

		System.out.print(count);
	}

}
