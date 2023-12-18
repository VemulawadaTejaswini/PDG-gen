import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			stdIn.nextLine();
			char[] t = stdIn.nextLine().toCharArray();
			int[] a = new int[100000];
			Arrays.fill(a, -1);
			for(int i=0;i<t.length;i++){
				a[i] = t[i]-'0';
			}
			for(int i=0;i<n;i++){  // misson
//				System.out.println("-----");
				int[] b = new int[100000];  // result
				Arrays.fill(b, -1);
				int idx = 0;  // index
				for(int j=0;;j++){
					if(a[j]==-1){  // finish
						break;
					}
					else if(j>0&&a[j]==a[j-1]){
						continue;
					}
					int cnt = 1;  // counter
					for(int k=j+1;;k++){
						if(a[j]==-1||a[j]!=a[k]){
							break;
						}
						else{
							cnt++;
						}
					}
					b[idx++] = cnt;
					b[idx++] = a[j];
//					System.out.println("set "+cnt);
//					System.out.println("set "+a[j]);
				}
				for(int j=0;j<b.length;j++){
					a[j] = b[j];
				}
			}
			for(int i=0;;i++){
				if(a[i]==-1){
					break;
				}
				System.out.print(a[i]);
			}
			System.out.println();
		}
	}
}