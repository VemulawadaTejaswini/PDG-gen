import java.util.ArrayList;
import java.util.Scanner;


public class Main {

        public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int count1 =0, count2 =0, count3 = 0, count4 =0;
        ArrayList<String> m= new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = in.next();
            m.add(s);
        }
        for (String s : m) {
            switch (s) {
                case "AC":
                    count1++;
                    break;
                case "WA":
                    count2++;
                    break;
                case "TLE":
                    count3++;
                    break;
                case "RE":
                    count4++;
                    break;
            }
        }
        System.out.println("AC x " + count1);
        System.out.println("WA x " + count2);
        System.out.println("TLE x " + count3);
        System.out.println("RE x " + count4);
    }
}