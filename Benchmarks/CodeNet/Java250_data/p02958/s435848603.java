import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            if (v != i + 1) {
                count++;
            }
        }
        sc.close();
        if(count == 0 || count == 2){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
