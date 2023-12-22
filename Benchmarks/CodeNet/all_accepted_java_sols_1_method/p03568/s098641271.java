import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),sum=0;
    int[] a=new int[n];
    for(int i=0;i<n;i++) {
    	a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++) {
    	if(a[i]%2==0)a[i]=1;
    	else a[i]=2;
    }
    for(int i=0;i<n;i++) {
    	int count=1;
    	for(int j=0;j<n;j++) {
    		if(j==i) count*=a[j];
    		else if(j>i)count*=3;
    		else count*=3-a[j];
    		//System.out.println(count);
    	}
    	sum+=count;
    }
    System.out.println(sum);
  }
}
