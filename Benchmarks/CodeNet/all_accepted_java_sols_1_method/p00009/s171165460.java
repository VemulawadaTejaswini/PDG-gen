import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                int n = sc.nextInt();
                boolean arr[] = new boolean[n+1];
                for (int i=0;i<=n;i++){
                    arr[i] = true;
                }
                arr[0] = false;
                arr[1] = false;
                for (int i=2;i<=n;i++){
                    if (arr[i]) {
                        for (int j=0;i*(j+2)<=n;j++){
                            arr[i*(j+2)] = false;
                        }
                    }
                }
                int m=0;
                for (int i=1;i<=n;i++){
                    if (arr[i]){
                        m++;
                    }
                }
                System.out.println(m);
            }
        }
    }
}
