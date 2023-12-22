import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int query = sc.nextInt();
            switch (query) {
                case 0:
                    numbers.add(sc.nextInt());
                    break;
                case 1:
                    System.out.println(numbers.get(sc.nextInt()));
                    break;
                case 2:
                    numbers.remove(numbers.size() - 1);
                    break;
            }
            
        }
    }
}
