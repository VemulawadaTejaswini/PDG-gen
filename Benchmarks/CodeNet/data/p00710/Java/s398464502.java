import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			int r=sc.nextInt();
			if(n==0&&r==0){
				break;
			}
			int[] cards=new int[n];
			for(int i=0;i<n;i++){
				cards[i]=n-i;
			}
			for(int i=0;i<r;i++){
				int p=sc.nextInt();
				int c=sc.nextInt();
				int[] tmp=new int[c];
				for(int j=0;j<c;j++){
					tmp[j]=cards[j+p-1];
				}
				for(int j=p+c-2;j>=c;j--){
					cards[j]=cards[j-c];
				}
				for(int j=0;j<c;j++){
					cards[j]=tmp[j];
				}
			}
			System.out.println(cards[0]);
		}
	}
}
