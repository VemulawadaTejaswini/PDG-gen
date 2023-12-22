import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt()-1;
        int Y = sc.nextInt()-1;
        int[][] min = new int[N][N];
        int[] ans = new int[N];
        for(int a=0;a<N;a++){
            for(int b=a+1;b<N;b++){
                if(a>=Y || b <=X){
                    min[a][b] = b-a;
                }else{
                    int other = Math.abs(a-X) + Math.abs(b-Y) + 1;
                    min[a][b] = Math.min(other, b-a);
                }
                ans[min[a][b]-1]++;
            }
        }
        for(int i =0;i<N-1;i++) {
            System.out.println(ans[i]);
        }
    }

}
