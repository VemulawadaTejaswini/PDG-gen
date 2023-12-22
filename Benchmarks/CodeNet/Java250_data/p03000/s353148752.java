import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
	Scanner in=new Scanner(System.in);
    int N=in.nextInt();
    int X=in.nextInt();
    int D[]=new int[N+1];
    int L[]=new int[N];
    for(int i=0;i<N;i++){
    	L[i]=in.nextInt();
    }
    int count=1;
    for(int i=1;i<N+1;i++){
    	D[i]=D[i-1]+L[i-1];
      	if(D[i]<=X)
          count++;
      	else
          break;
    }
    System.out.println(count);
    in.close();
  }
}