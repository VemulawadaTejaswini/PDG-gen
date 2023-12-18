import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long k = sc.nextLong();
    long[] a = new long[n+1];
    long[] b = new long[m+1];
    long time=0;
    int x =0,y=0,count=0;

    for(int i=0;i<n;i++) {
    	a[i] = sc.nextLong();
    	}
    for(int i=0;i<m;i++) {
    	b[i] = sc.nextLong();
    	}
    a[n]=Integer.MAX_VALUE;
    b[m]=Integer.MAX_VALUE;
    do {
    	time+=Math.min(a[x], b[y]);
    	if(k<time)break;
    	else {
    		count++;
    		if(a[x]>b[y]) {
    			y++;
    		}
    		else {
    			x++;
    		}
    	}
    }while(k>=time);
    System.out.println(count);
  }
}