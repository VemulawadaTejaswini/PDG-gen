import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> holeList  = new ArrayList<>();

        for (int i = 0; i < m; i++){
            holeList.add(sc.nextInt());
        }

        long count = 0;
        long countOneBefore = 1;
        long countTwoBefore = 0;

        int holeIndex = 0;
        int holeStair = 0;
        if (holeList.size() != 0){
            holeStair = holeList.get(holeIndex);
        }

        for (int i = 0 ; i < n; i++){

            if (holeStair == (i + 1)){
                // 穴が開いている場合
                count = 0;
                countTwoBefore = countOneBefore;
                countOneBefore = count;

                holeIndex += 1;
                holeStair = holeList.get(Math.min(holeIndex, m - 1));
            }else {
                count = countOneBefore + countTwoBefore;
                if (count >= 1000000007L){
                    count = count % 1000000007L;
                }
                countTwoBefore = countOneBefore;
                countOneBefore = count;
            }
        }

        System.out.println(count);
    }

}