import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        ar.add(a);
        ar.add(b);
        ar.add(c);
        Collections.sort(ar);
        if (ar.get(2) == ar.get(0) + ar.get(1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}