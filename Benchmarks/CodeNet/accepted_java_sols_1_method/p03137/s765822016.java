import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),m=sc.nextInt();
    int[] x=new int[m],d=new int[m-1];
    for(int i=0;i<m;i++)x[i]=sc.nextInt();
    Arrays.sort(x);
    for(int i=0;i<m-1;i++)d[i]=x[i+1]-x[i];
    Arrays.sort(d);
    if(n>=m) {
    	System.out.println(0);
    }else {
    	int j=m-2;
    	int res=x[m-1]-x[0];
    	for(int i=0;i<n-1;i++) {
    		//System.out.println(res);
    		res-=d[j];
    		j--;
    	}
    	System.out.println(res);
    }
  }
}
