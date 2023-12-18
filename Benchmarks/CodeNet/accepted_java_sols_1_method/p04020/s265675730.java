import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A=new int[N];
        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
        }

        long res=0;
        int count = 0;
        boolean[] amari=new boolean[N];

        for(int i=0; i<N; i++){
            if(A[i]!=0&&amari[i]){
                A[i]++;
            }
            int h = A[i]/2;
            if(A[i]%2==1){
                amari[Math.min(i+1,N-1)] = true;
            }
            res = res + h;

        }
        
        System.out.println(res);
        
        }
     
    }