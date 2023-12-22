import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int list[] = new int[N];
            
        for (int i = 0; i < N; i++){
            int value = sc.nextInt();
            list[i] = value;
        }
        
        Arrays.sort(list);
        
        for (int i = 0; i < N; i++){
            if (i != N-1 && list[i] == list[i+1]){
                System.out.println("NO");
                return;
            } 
        }
        
        System.out.println("YES");
    }
}
