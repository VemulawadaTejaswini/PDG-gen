import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        sc.close();

        ArrayList<Long> numList = new ArrayList<Long>();
        numList.add(a * c);
        numList.add(a * d);
        numList.add(b * c);
        numList.add(b * d);

        System.out.println(Collections.max(numList));

    }
}