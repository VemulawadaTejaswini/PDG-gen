import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int N =sc.nextInt();
    int[] array= new int[N];
    
    int sum=0;
    for(int i=0;i<N;i++){
    	array[i]=sc.nextInt();
    	sum+=array[i];
    }
    int sum2=0;
    int dif=0;
    int min=10000;
    for(int i=0;i<N;i++){
    	sum-=array[i];
    	sum2+=array[i];
    	dif=Math.abs(sum-sum2);
    	if(min>dif){
    		min=dif;
    	}
    }
    System.out.println(min);
    
    
    
    
    
  }
}