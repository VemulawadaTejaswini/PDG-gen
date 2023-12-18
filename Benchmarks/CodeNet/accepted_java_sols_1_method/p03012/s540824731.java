import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        int[] w = new int[N];
        int sum = 0;
        for(int i = 0; i < N; i++) {
            w[i] = Integer.parseInt(sc.next());
            sum += w[i];
        }
        
        int s1 = 0;
        for(int i = 0; i < N; i++) {
            s1 += w[i];
            if(s1 >= sum/2) {
                if(s1 - (sum-s1) <= (sum-s1+w[i]) - (s1-w[i])) {
                    System.out.println(s1 - (sum-s1));
                }else {
                    System.out.println((sum-s1+w[i]) - (s1-w[i]));
                }
                break;
            }
        }
    }
}