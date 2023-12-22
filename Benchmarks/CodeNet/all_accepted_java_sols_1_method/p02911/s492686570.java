import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
      	int[] Player;
      	int Current;
      	Player=new int[N]; 	
      	for (int i = 0 ; i < Q; i ++){
          Current = sc.nextInt();
          Player[Current-1]=Player[Current-1]+1;          
        }
      	for ( int i = 0 ; i < N ; i ++){
          if((Player[i]+K-Q)>0){
          	System.out.println("Yes");
          }else{
            System.out.println("No");
          }
        }
	}
}