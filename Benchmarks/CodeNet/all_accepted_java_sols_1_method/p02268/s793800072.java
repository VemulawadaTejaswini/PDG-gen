import java.util.Scanner;


public class Main{

	public static void main(String args[]){
		int i,j,n,h;
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
			int a=0,b=n;
			
	
			while(a<b){
				h=(a+b)/2;
				if (t[i] == s[h]){
					count++;
					break;
				} 
				if (t[i]<s[h])
					
					b = h;
				else 
					a = h+1;	
				
			}
			
		}
		
		
		System.out.println(count);		
	}
}


/*int n,k;
Scanner sc=new Scanner(System.in);
n=Integer.parseInt();
int tr[]=new int[n+1];*/