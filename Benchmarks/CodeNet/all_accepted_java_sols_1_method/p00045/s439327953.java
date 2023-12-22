import java.util.*;

class Main {


    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int totalMoney = 0;
        int totalNum   = 0;
        int totalKind  = 0;

        while(sc.hasNext()) {
            String [] line = sc.nextLine().split(",");
            int m = Integer.parseInt(line[0]);
            int n = Integer.parseInt(line[1]);

            totalMoney += m * n;
            totalNum += n;
            totalKind += 1;

        }

        System.out.println(totalMoney);
        System.out.println(Math.round((totalNum + 1.0)/ totalKind));

    }
}