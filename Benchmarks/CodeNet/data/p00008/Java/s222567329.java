import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int aList[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int bList[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int cList[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int dList[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        try (Scanner scan = new Scanner(System.in)) {
            String inDataStr;
            while ((inDataStr = scan.nextLine()) != null && !"".equals(inDataStr)) {
                int inData = Integer.parseInt(inDataStr);
                int combi = 0;
                for (int a : aList) {
                    for (int b : bList) {
                        for (int c : cList) {
                            for (int d : dList) {
                                if (a + b + c + d == inData) {
                                    combi++;
                                }
                            }
                        }
                    }
                }
                System.out.println(combi);
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }

}