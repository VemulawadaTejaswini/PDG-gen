import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] as = new int[n];
        for(int i=0; i<n; i++){
            int t = sc.nextInt();

            if(t % 2 == 0){
                if (t % 3 != 0 && t % 5 != 0) {
                    System.out.println("DENIED");
                    return;
                }

            }
        }
        System.out.println("APPROVED");
    }
}
