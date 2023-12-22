import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] H = new int[N];

        if(N==1){
            System.out.println("Yes");
            return;
        }

        for(int i=0; i<N; i++){
            H[i] = sc.nextInt();
        }
        
        for(int i=N-1; i>=1; i--){
            if(H[i]+1==H[i-1]){
                H[i - 1] -= 1;
            }
            else if(H[i]+1<H[i-1]){
                System.out.println("No");
                return;
            }
            if(i==1){
                System.out.println("Yes");
            }
        }
    }
}