import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n - 1];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < n; j++){
                switch(i){
                    case 0:
                        a[j] = scan.nextInt();
                        break;
                    case 1:
                        b[j] = scan.nextInt();
                        break;
                }
            }
        }
        int out = 0;
        for(int i = 0; i < n - 1; i++){
            c[i] = scan.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            if(a[i + 1] - a[i] == 1){
                out += c[a[i] - 1];
            }
        }
        for(int i = 0; i < n; i++){
            out += b[i];
        }
        System.out.println(out);
    }
}