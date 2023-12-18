import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(true) {
        		int n = sc.nextInt();
        		int r = sc.nextInt();
        		if(n==0 && r==0) break;
        		int [] cards = new int[n+1];
        		for(int i=1,j=n;i<=n;i++,j--) {
        			cards[i] = j;
        		}
        		for(int i=0;i<r;i++) {
        			int p = sc.nextInt();
        			int c = sc.nextInt();
        			int [] sh = new int[c];
        			for(int j=p,k=0;j<p+c;j++,k++) {
        				sh[k] = cards[j];
        			}
        			for(int j=p+c-1,k=p-1;k>=1;j--,k--) {
        				cards[j] = cards[k];
        			}
        			for(int j=1,k=0;k<c;j++,k++) {
        				cards[j] = sh[k];
        			}
        		}
        		System.out.println(cards[1]);
        	}
        }
    }
}
        		
