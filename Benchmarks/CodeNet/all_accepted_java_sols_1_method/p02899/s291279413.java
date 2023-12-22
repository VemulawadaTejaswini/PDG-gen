import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> a = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < n; i++) {
            a.put(sc.nextInt(),i);
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.print(a.get(i+1) + 1);
            System.out.print(" ");
        }
    }
}
