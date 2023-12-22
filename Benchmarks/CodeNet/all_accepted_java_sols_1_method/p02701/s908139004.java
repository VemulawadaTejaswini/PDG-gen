import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> list = new ArrayList<String>();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            list.add(str[i]);
        }
        List<String> listB = new ArrayList<String>(new HashSet<>(list));

        System.out.println(listB.size());
        sc.close();
    }
}
