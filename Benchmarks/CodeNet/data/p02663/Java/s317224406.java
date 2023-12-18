import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int h1 = scn.nextInt();
        int m1 = scn.nextInt();
        int h2 = scn.nextInt();
        int m2 = scn.nextInt();
        int k = scn.nextInt();

        int wakeUpTime = ((h2-h1)*60)+m1-m2;
        int StartStudy = wakeUpTime - k;

        System.out.println(StartStudy);

        scn.close();

    }

}