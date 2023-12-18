import java.util.*;

public class Main {
    int[] InsertionSort(int[]lst){
		int n=lst.length;
		for(int i=1;i<n;i++){
			int j=i-1,v=lst[i];
			while( 0 <= j  && v < lst[j]){
				lst[j+1]=lst[j];
				lst[j]=v;
				j--;
			}
			new Main().print(lst);
		}
		return lst;
	}
	void print(int[]a){
	    for(int i=0;i<a.length;i++){
	        if(i==0){System.out.printf("%d",a[i]);continue;}
	        System.out.printf(" %d",a[i]);
	    }
	    System.out.println();
	}
	
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++){x[i]=sc.nextInt();}
        Main a=new Main();
        a.print(x);
        a.InsertionSort(x);
    }
}
