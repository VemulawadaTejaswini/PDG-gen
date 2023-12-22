import java.util.Scanner;


public class Main{

	public static void main(String args[]){
		int i,j,n;;
		Scanner sc=new Scanner(System.in);
		n=Integer.parseInt(sc.next());
		int s[]=new int[n+1];
		for(i=0;i<n;i++){
			s[i]=Integer.parseInt(sc.next());
			
		}
		
		
		int q=Integer.parseInt(sc.next());
		int t[]=new int[q+1];
		for(i=0;i<q;i++){
			t[i]=Integer.parseInt(sc.next());
		}
		
		int count=0;
		for(i=0;i<q;i++){
			if(s[n/2]<t[i]){
				for(j=(n/2)+1;j<n;j++){
					
					if(s[j]==t[i]){
						count++;
						break;
					}
				}
			}
			else{
				for(j=0;j<(n/2)+1;j++){
					
					if(s[j]==t[i]){
						count++;
						break;
					}
				}
			}
		}
		
		System.out.println(count);
		
		
		
		
		
		
	}
}