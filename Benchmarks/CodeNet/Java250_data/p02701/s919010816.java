import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Set<String> kh = new HashSet<String>();
        while(sc.hasNext()){
            kh.add(sc.next());
        }
        System.out.println(kh.size());
    }
}