import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      	int M = sc.nextInt();
      	int A[] = new int[N];
      	int sum=0;
      	int count=0;
      
      	for(int i=0;i<N;i++){
        	A[i]=sc.nextInt();
        	sum=sum+A[i];
        }
      
      	for(int i=0;i<N;i++){
        	if(A[i]>=(double)sum/4/M){
            	count=count+1;
            }
        }
       	
		if(count>=M){
          System.out.println("Yes");
        }
      	else{
          System.out.println("No");
        }
		
	}
}