import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            list.add(sc.next());
        }
        if (list.contains("Y")){
            System.out.println("Four");
        } else {
            System.out.println("Three");
        }
    }
}