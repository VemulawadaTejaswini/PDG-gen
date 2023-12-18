import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),sum=0,ave;
  	long var1=0,var2=0;
  	int[] x=new int[n];
  	for(int i=0;i<n;i++){
  		x[i]=sc.nextInt();
  		sum+=x[i];
  	}
  	ave=sum/n;
  	for(int i=0;i<n;i++){
  		var1+=(int)Math.pow(x[i]-ave,2);
  		var2+=(int)Math.pow(x[i]-ave-1,2);
  	}
  	System.out.print(Math.min(var1,var2));
  }
}