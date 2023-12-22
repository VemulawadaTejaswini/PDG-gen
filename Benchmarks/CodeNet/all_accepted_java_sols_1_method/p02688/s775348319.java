import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<Integer>();
        int n=scan.nextInt();
        int k=scan.nextInt();
        for(int i=0;i<k;i++){
            int z=scan.nextInt();
            for(int j=0;j<z;j++){
                int wk=scan.nextInt();
                hs.add(wk);
            }
        }
        System.out.println(n-hs.size());
    }
}
