import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arrayv=new int[n];
		String[] arrayc=new String[n];
		int[] arrayj=new int[n];
		int sum=0;

		for(int i=0;i<n;i++) {
			arrayc[i]=sc.next();
			arrayv[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j)continue;
				if(arrayc[i].compareTo(arrayc[j])>0) {
					arrayj[i]++;
				}else if(arrayc[i].equals(arrayc[j])) {
					if(arrayv[i]<arrayv[j]) {
						arrayj[i]++;
					}
				}
				//System.out.print(arrayc[i].compareTo(arrayc[j])+" ");
			}
			//System.out.println();
			arrayj[i]++;
		}
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++) {
				if(arrayj[j]==i) {
					System.out.println(j+1);
					break;
				}
			}
		}

	}
}
/*
 6
khabarovsk 20
moscow 10
kazan 50
kazan 35
moscow 60
khabarovsk 40
 */

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


