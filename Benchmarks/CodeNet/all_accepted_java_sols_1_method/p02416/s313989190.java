import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        int sum = 0;
        while (true) {
            String s = sc.nextLine();
            if (s.equals("0"))
                break;
            A.add(s);
        }
        for (int i = 0; i < A.size(); i++) {
            String s = A.get(i);
            for (int j = 0; j < s.length(); j++) {
                sum += Character.getNumericValue(s.charAt(j));
            }
            B.add(sum);
            sum = 0;
        }
        for (int n = 0; n < B.size(); n++) {
            System.out.println(B.get(n));
        }
        sc.close();
    }
}
