import java.text.SimpleDateFormat;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<String,Integer>();

        String temp = sc.nextLine();

        String[] tempArr = temp.split(" ");

        int N = Integer.parseInt(tempArr[0]);
        int M = Integer.parseInt(tempArr[1]);
        int C = Integer.parseInt(tempArr[2]);

        int[] MList = new int[M];

        temp = sc.nextLine();
        tempArr = temp.split(" ");
        for (int j = 0; j < M; j++) {
            MList[j] = Integer.parseInt(tempArr[j]);
        }

        int sum = 0;
        int counter = 0;
        for (int i = 0; i < N; i++) {
            temp = sc.nextLine();
            tempArr = temp.split(" ");
            sum = 0;
            for (int j = 0; j < M; j++) {
                sum += Integer.parseInt(tempArr[j]) * MList[j];
            }
            if ((sum + C) > 0) {
                counter++;
            }
        }

        System.out.println(counter);





    }

}
