import java.util.*;
class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dam = new int[N];
        int[] yama = new int[N];
        for(int i=0;i<N;i++){
            dam[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            if(i%2==0){
                yama[0] += dam[i];
            }
            else{
                yama[0] -= dam[i];
            }
        }
        for(int i=1;i<N;i++){
            yama[i] = 2*dam[i-1] - yama[i-1];
        }
        for(int i=0;i<N;i++){
            System.out.print(yama[i] + " ");
        }
    }
}