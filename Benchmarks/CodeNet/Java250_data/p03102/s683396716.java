import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =  sc.nextInt();
        int c = sc.nextInt();

        List<Integer> bList = new ArrayList<>(m);
        for (int i = 0; i < m; i++){
            int h = sc.nextInt();
            bList.add(h);
        }
        List<List<Integer>> aList = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            List<Integer> aRow = new ArrayList<>(m);
            for (int j = 0; j < m; j ++){
                aRow.add(sc.nextInt());
            }
            aList.add(aRow);
        }

        int seitou = 0;
        for (int i = 0; i < n; i++){
            if (largerThanC(aList.get(i), bList, c, m)){
                seitou += 1;
            }
        }

        System.out.println(seitou);
    }

    private static boolean largerThanC(List<Integer> aRow, List<Integer> bList, int c, int m){
        int sum = 0;
        for(int j = 0; j < m; j++){
            sum += aRow.get(j) * bList.get(j);
        }
        return sum + c > 0;
    }
}