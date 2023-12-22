import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        boolean flag = false;
        Set<String> checkHash = new HashSet<String>();
        for(String str : list) {
            if(checkHash.contains(str)) {
                flag = true;
                break;
            } else {
                checkHash.add(str);
            }
        }

        if (flag) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
