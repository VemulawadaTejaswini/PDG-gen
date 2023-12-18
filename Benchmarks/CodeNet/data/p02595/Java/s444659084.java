import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
	int N=in.nextInt();
      int D=in.nextInt();
      int x[]=new int[100000];
      int y[]=new int[100000];
      int i=0;
      int count=0;
      int res[]=new int[100000];
      for(int j=0;j<N;j++){
        x[j]=in.nextInt();
        y[j]=in.nextInt();
      }
      for(i=0;i<N;i++){
       res[i]=Math.sqrt(Math.pow(x[i],2) + Math.pow(y[i],2));
        if(res>=D){
          count=count+1;
        }
      }
      System.out.println(count);
      
      
    }
}