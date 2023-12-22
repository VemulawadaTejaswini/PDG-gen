import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<Integer>(3);
        for(int i = 0; i < 3; i++) {
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        System.out.printf("%d %d %d\n", a.get(0), a.get(1), a.get(2));
        sc.close();
    }
}
