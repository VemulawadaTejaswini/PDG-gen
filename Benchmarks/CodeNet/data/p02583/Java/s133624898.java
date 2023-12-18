import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> numList = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            numList.add(sc.nextLong());
        }
        sc.close();
        ArrayList<Long> listB= new ArrayList<Long>();

        long a = 0;
        long b = 0;
        long c = 0;
        int ans = 0;

        for (int i = 0; i < numList.size(); i++) {
            for (int j = 1; j < numList.size(); j++) {
                for (int k = 2; k < numList.size(); k++) {
                    a = numList.get(i);
                    b = numList.get(j);
                    c = numList.get(k);
                    listB.add(a);
                    listB.add(b);
                    listB.add(c);
                    List<Long> listC = new ArrayList<Long>(new HashSet<>(listB));
                    if (listC.size() > 2 && a + b > c && b + c > a && a + c > b) {
                        ans += 1;
                    }
                   listB= new ArrayList<Long>();
                }
            }
        }

        System.out.println(ans);
    }
}