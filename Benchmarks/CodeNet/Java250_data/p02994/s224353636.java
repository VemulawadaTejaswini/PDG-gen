import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int L = sc.nextInt();

        int sum = 0;
        if(L>=0)  {
            for(int i=2; i<=N; i++) {
                sum += L + i -1;
            } 
        } else {
            if(N > -L) {
                for(int i=1; i<=N; i++) {
                    sum += L + i -1;
                }
            } else {
                    for(int i=1; i<N; i++) {
                        sum+= L + i -1;
                    }
            }
            
        }
        System.out.println(sum);
    }
}