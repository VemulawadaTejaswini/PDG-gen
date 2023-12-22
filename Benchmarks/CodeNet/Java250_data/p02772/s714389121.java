import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        
        boolean isApprove = true;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0 && (a[i] % 3 != 0 && a[i] % 5 != 0)) {
                isApprove = false;
            }
            if (!isApprove) {
                break;
            }
        }
        
        String result = isApprove ? "APPROVED" : "DENIED";
        
        System.out.println(result);
    }
}