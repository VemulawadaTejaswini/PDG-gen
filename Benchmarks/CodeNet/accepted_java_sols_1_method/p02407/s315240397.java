import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for(int i=n-1; i>=0; i--){
            a[i] = sc.next(); 
        }
        System.out.println(String.join(" ", a));
    }
}

