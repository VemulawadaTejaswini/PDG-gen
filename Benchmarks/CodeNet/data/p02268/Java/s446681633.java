import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int i,j,n,q,count=0,mid;
		n=scan.nextInt();
		int[] s=new int[n];
		for(i=0;i<n;i++) {
			s[i]=scan.nextInt();
		}
		mid=n/2;
		q=scan.nextInt();
		int[] t=new int[q];
		for(i=0;i<q;i++) {
			t[i]=scan.nextInt();
		}
		for(i=0;i<q;i++) {
			if(t[i]<s[mid]) {
				for(j=0;j<mid;j++) {
					if(t[i]==s[j]) {
						count++;
						break;
					}
				}
			}
			else {
				for(j=mid;j<n;j++) {
					if(t[i]==s[j]) {
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}
