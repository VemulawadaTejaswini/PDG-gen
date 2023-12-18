import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),k=sc.nextInt(),sum=0;
    int[] x=new int[n];
    for(int i=0;i<n;i++){
      x[i]=sc.nextInt();
      sum+=2*(int)Math.min(x[i],k-x[i]);
    }
    System.out.println(sum);
  }
}
