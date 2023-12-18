import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K;
		K=sc.nextInt();
		int length =1;
		int a[] = new int[20];
		a[0]=0;
		for (int i =0;i<K;i++) {
			if (length==1) {
				a[0]++;
				if (a[0]>=10) {
					a[0]=1;
					a[1]=0;
					length++;
				}

			} else {
				int j=length-1;
				while(j>0&&a[j-1]<a[j]) {
					j--;
				}
				if (j==length-1) {
					if (a[j]==9) {
						int k = j;
						while (k>=0&&a[k]==9) {
							k--;
						}
						if (k==-1) {
							length++;
							for (int m=1;m<length;m++) {
								a[m]=0;
							}
							a[0]=1;
						} else {
							while (k>0&&a[k-1]<a[k]) {
								k--;
							}
							a[k] ++;
							int s = a[k];
							k=k+1;
							for (;k<length;k++) {
								if (s>0) {
									s--;
								}
								a[k]=s;
							}
						}
					} else {
						a[j]++;
					}
				} else {
					a[j]++;
					int s=a[j]-1;
					for (int k=j+1;k<length;k++) {
						a[k]=s;
						if (s>0) {
							s--;
						}
					}
				}
//				for (int k=0;k<length-1;k++) {
//					if (Math.abs(a[k+1]-a[k])>1) {
//						System.out.println(i);
//						for (int m=0;m<length;m++) {
//							System.out.print(a[m]);
//						}
//						return;
//					}
//				}

			}
		}
		for (int i=0;i<length;i++) {
			System.out.print(a[i]);
		}
	}
}