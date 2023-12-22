import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),m=sc.nextInt(),count=0;
    int[] h=new int[n];
    boolean[] res=new boolean[n];
    Arrays.fill(res, true);
    for(int i=0;i<n;i++)h[i]=sc.nextInt();

    for(int i=0;i<m;i++) {
    	int x=sc.nextInt()-1,y=sc.nextInt()-1;
    	if(h[x]<h[y]) {
    		res[x]=false;
    	}else if(h[x]>h[y]) {
    		res[y]=false;
    	}else {
    		res[x]=false;
    		res[y]=false;
    	}
    }
    for(int i=0;i<n;i++) {
    	if(res[i])count++;
    	//System.out.print(res[i]+" ");
    }
    //System.out.println();
    System.out.println(count);
  }
}
