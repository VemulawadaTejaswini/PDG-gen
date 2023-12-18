import java.util.Scanner;


public class Main{

	public static void main(String args[]){
	int i,j,k,n,q;;
	Scanner sc=new Scanner(System.in);
	
	n=Integer.parseInt(sc.next());
	long s[]=new long[n+1];
	for(i=0;i<n;i++){
		s[i]=Integer.parseInt(sc.next());
	}
	
	q=Integer.parseInt(sc.next());
	long T[]=new long[q+1];
	
	for(i=0;i<q;i++){
		T[i]=Integer.parseInt(sc.next());
	}
	
	int count=0;
	
	for(j=0;j<q;j++){
		for(i=0;i<n;i++){
	if(T[j]==s[i]){
			count++;
			break;
			}
		}	
	}
	System.out.println(count);
	}
}