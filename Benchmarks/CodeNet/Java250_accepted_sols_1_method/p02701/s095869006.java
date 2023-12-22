import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Set<String> gift = new HashSet<String>(); 
        int N = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < N; i++) {
            gift.add(sc.nextLine());
        }

        System.out.println(gift.size());

    }
}