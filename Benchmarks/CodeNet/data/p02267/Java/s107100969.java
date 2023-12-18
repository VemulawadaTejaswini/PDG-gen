import java.util.*;

public class Main{
	static int search(int[] lst,int n,int key){
		for(int i=0;i<n;i++){
		    if(lst[i]==key)return i;
		}
		return -1 ;
	}
	
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    
	    int n=sc.nextInt();
	    int[] lst = new int[n+1];
	    for(int i=0;i<n;i++)lst[i]=sc.nextInt();
	    
	    int q=sc.nextInt();
	    int sum=0;
	    
	    for(int i=0;i<q;i++){
	        if(search(lst,n+1,sc.nextInt())>=0)sum++;
	    }
	    
	    System.out.println(sum);
	}
}
