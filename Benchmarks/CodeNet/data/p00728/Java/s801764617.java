import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> averageList = new ArrayList<Integer>();
        while(num != 0) {
            int score[] = new int[num];
            for(int i = 0; i < num; i++) {
                score[i] = sc.nextInt();
            }
            int max = 0;
            int min = 1001;

            for(int i = 0; i < score.length; i++) {
//                System.out.println("配列全部" + score[i]);
            }

            for(int i = 0; i < score.length; i++) {
                min = Math.min(min, score[i]);
//                System.out.println("最小値もとｍれう" + min);
            }
//            for(int i = 0; i<score.length; i++) {
//                if(min == score[i]) {
//                    System.out.println("配列i" + score[i]);
//                    System.out.println("最小値" + min);
//                    score[i] = 0;
//                }
//            }
            for(int i = 0; i < score.length; i++) {
                max = Math.max(max, score[i]);

            }
//            System.out.println("さいだい" + max);

//            for(int i = 0; i < score.length; i++) {
//                if(max == score[i]) {
//                    System.out.println("配列i" + score[i]);
//                    System.out.println("最題値" + max);
//                    score[i] = 0;
//                }
//            }

            int sum = 0;
            for(int i = 0; i < score.length; i++) {
                sum += score[i];
            }
            int average = (sum-max-min) / (score.length-2);
            averageList.add(average);
//            System.out.println(average);
            num = sc.nextInt();
        }
        for( int i = 0; i<averageList.size(); i++) {
            System.out.println(averageList.get(i));
        }


    }

}

