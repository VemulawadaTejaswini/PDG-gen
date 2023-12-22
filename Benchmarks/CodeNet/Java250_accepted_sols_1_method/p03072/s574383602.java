import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i+1; j++) {
                if (list.get(i) < list.get(j)) { 
                    break;
                }
                if ( j == i-1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
