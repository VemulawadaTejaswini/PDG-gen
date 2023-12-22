import java.util.Scanner;
import java.util.Arrays;

public class Main{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,r,p,c;
		int[] card;
		int[] tmp1;
		int[] tmp2;
		while(true){
			n = sc.nextInt();
			r = sc.nextInt();
			card = new int[n];
			for(int i=0;i<n;i++){
				card[i]=n-i;
			}
			if(n==0&&r==0){
				break;
			}
			for(int j=0;j<r;j++){
				p = sc.nextInt();
				c = sc.nextInt();
				tmp1 = Arrays.copyOfRange(card,0,p-1);
				tmp2 = Arrays.copyOfRange(card,p-1,c+p-1);
				for(int i=0;i<c;i++){
					card[i]=tmp2[i];
				}
				for(int i=0;i<p-1;i++){
					card[c+i]=tmp1[i];
				}
			}
			System.out.println(card[0]);
		}
		sc.close();
	}
}
