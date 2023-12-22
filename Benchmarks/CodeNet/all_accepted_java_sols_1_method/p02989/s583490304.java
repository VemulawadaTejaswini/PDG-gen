import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> v = new ArrayList<>();
        for (int i=0;i<n;i++){
            v.add(scanner.nextInt());
        }
        Collections.sort(v);
        int a = v.get(n/2 - 1);
        int b = v.get(n/2);
        System.out.println(b-a);


    }

}