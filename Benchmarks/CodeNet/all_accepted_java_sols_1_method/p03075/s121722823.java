import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int[] anntena = new int[5];
        for (int i = 0; i < 5; i++) {
            anntena[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        String ans = "Yay!"; 
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                int distance = anntena[j] - anntena[i];
        
                if (distance > k) {
                    ans = ":(";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
