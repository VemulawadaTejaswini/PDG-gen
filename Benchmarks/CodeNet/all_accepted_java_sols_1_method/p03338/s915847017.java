import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    String s = scan.next();
	    scan.close();
	    char stoc[]=s.toCharArray();
	    int max=0;
		for (int i = 0; i < n-1; i++) {
			int cnt=0;
			int check[]=new int[26];
			for(int j=0;j<26;j++) {
				check[j]=0;
			}
			//Xカウント
			for (int j = 0; j <=i ; j++) {
				int a=(int)'a';
				if(check[stoc[j]-a]==0) {
					check[stoc[j]-a]=1;
					for (int k = i+1; k <n ; k++) {
						if(check[stoc[k]-a]==1) {
							cnt++;
							check[stoc[k]-a]=-1;
							break;
						}
					}
				}
			}
			if(max<cnt)max=cnt;
		}
		System.out.println(max);
	}

}
