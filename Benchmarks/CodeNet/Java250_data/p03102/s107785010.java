import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int m = sn.nextInt();
        int c = sn.nextInt();
        
        List<Integer> blist = new ArrayList<>();
        for (int i = 0; i < m; i++){
            blist.add(sn.nextInt());
        }
        
        int resultCount = 0;
        for (int j = 1; j <= n; j++){
            int correct = 0;
            for (int i = 0; i < m; i++){
                int a = sn.nextInt();
                correct = correct + blist.get(i) * a;
            }
            correct += c;
            if(correct > 0) {
                resultCount++;
            }
        }
        System.out.println(resultCount);
    }
}