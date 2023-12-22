import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            p[i] = sc.nextInt();
            if(p[i] - 1 != i){
                p[i] = -1;
            }
        }
        if(n < 3){
            System.out.println("YES");
        }else{
            Arrays.sort(p);
            if(p[2] == -1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        sc.close();

    }
}