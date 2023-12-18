import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A=new int[N];
        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
        }

        int money=1000;
        int kabu=0;
        
        for(int i=0; i<N-1; i++){
            if(A[i]<A[i+1]){
                kabu = money/A[i];
                money = money + kabu*(A[i+1]-A[i]);
            }

        }

        System.out.println(money);
        
        
        
        
        
        }
    }