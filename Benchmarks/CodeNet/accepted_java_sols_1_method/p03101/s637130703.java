import java.text.SimpleDateFormat;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new TreeMap<>();

        String temp = sc.nextLine();

        String[] tempArr = temp.split(" ");

        int H = Integer.parseInt(tempArr[0]);
        int W = Integer.parseInt(tempArr[1]);

        temp = sc.nextLine();

        tempArr = temp.split(" ");

        int h = Integer.parseInt(tempArr[0]);
        int w = Integer.parseInt(tempArr[1]);

        System.out.println((H - h) * (W - w));




    }

}
