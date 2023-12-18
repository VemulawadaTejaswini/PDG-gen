import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int p[] = new int[N];
        for(int i=0;i < N;i++){
            p[i] = scan.nextInt();
        }
        Arrays.sort(p);
        int sum = 0;
        for(int i=0;i < N;i++){
            if(i == N - 1){
                sum += p[i] / 2;
            }
            else{
                sum += p[i];
            }
        }
        System.out.println(sum);
    }
}
