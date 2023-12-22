import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for(int i=0;i<n;i++){
            h[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int max = 0;
        int res = 0;
        for(int i=0;i<n;i++){
            if(h[i] >= max){
                res++;
            }
            max = Math.max(max,h[i]);
        }
        System.out.println(res);
    }

}