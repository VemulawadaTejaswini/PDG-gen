import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
	int[] P=new int[N];
    int min=0;
    int count=0;
    
    for(int i=0;i<N;i++){
      P[i]=sc.nextInt();
    }
    min=P[0];
    
    for(int i=0;i<N;i++){
	  if(min>=P[i]){
        min=P[i];
        count++;
      }
    }
    System.out.println(count);
    
  }
}
