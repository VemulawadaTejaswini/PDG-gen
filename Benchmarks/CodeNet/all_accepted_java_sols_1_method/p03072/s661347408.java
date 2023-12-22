import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N =  Integer.parseInt(sc.next());
        
        Integer a[] = new Integer[N];
        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }
        
        int max = a[0];
        int count = 0;
        
        for (int i=0; i<N; i++) {
            if (max <= a[i]) {
                max = a[i];
                count++;
            }
        }
        
        System.out.println(count);
    }
}