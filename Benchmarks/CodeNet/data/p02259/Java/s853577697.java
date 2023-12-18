import java.util.*;

public class Main {
	int bubbleSort(int[]lst){
		int n=lst.length;
		int count=0;
		for (int i=1;i<n;i++){
			for(int j=n-1;j>=i;j--){
				if(lst[j]<lst[j-1]){
					int x=lst[j];
					lst[j]=lst[j-1];lst[j-1]=x;
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int[]x=new int[n];
	    for(int i=0;i<n;i++){x[i]=sc.nextInt();}
	    int c=new Main().bubbleSort(x);
	    for(int i=0;i<n;i++){
	        if(i==0){System.out.printf("%d",x[i]);continue;}
	        System.out.printf(" %d",x[i]);
	    }
	    System.out.printf("\n%d\n",c);
	}
}
