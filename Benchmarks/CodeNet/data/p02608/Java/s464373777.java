import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ans = new int[N];

        long res = 0;
        long count=0;
        for(int i=1; i<Math.pow(N,0.5); i++){
            for(int j=1; j<Math.pow(N,0.5); j++){
                for(int l=1; l<Math.pow(N,0.5); l++){
                    res = i*i + j*j + l*l +i*j + j*l + l*i;
                    if(res<=N){
                        ans[(int)res-1]++;
                    }
                }
            }
        }

        for(int i=0; i<N; i++){
            System.out.println(ans[i]);
        }
        System.out.println(count);
        
        }
    }