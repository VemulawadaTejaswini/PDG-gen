import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[10];
		for(int i=0;i<n;i++){
			boolean ans=true;
				for(int j=0;j<10;j++){
					a[j]=sc.nextInt();
				}
				for(int j=0;j<9;j++){
					if(a[j]<a[j+1])ans=false;
			}	
				if(ans)System.out.println("NO");
				else System.out.println("YES");
		}
	}
	
}