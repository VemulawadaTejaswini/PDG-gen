import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N];
        int counter = 0;
        
        for(int i = 0; i < N; i++){
            p[i] = sc.nextInt();
            if(p[i] != i + 1){
                counter++;
            }
        }
        
        if(counter == 0 || counter == 2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}