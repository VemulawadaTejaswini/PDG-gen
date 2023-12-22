import java.util.*;
class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int ans = 0;
            String n = sc.next();
            for (int i = 0 ; i < n.length(); i++) {
                ans +=  Character.getNumericValue(n.charAt(i));
            }
            System.out.println(Integer.parseInt(n) % ans == 0 ? "Yes" : "No");
        }
    }
}