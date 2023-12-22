import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int N= scan.nextInt();
        HashSet hs = new HashSet();
        for(int i=0;i<N;i++){
            hs.add(scan.next());
        }
        System.out.println(hs.size());
    }
}
