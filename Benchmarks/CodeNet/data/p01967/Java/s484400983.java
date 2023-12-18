import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = getScannerFromFile();
        int countBox = Integer.valueOf(sc.nextLine());
        String[] arrBoxCap = sc.nextLine().split(" ");
        int countInstruction = Integer.valueOf(sc.nextLine());

        int[] boxes = new int[countBox];
        for(int i = 0; i < countInstruction; i++) {
            String [] instruction = sc.nextLine().split(" ");

            int iBox = Integer.valueOf(instruction[1]) - 1;
            int apple = Integer.valueOf(instruction[2]);

            // Cho vao
            if(instruction[0].equals("1")) {
                boxes[iBox] += apple;
            }
            // Lay ra
            else {
                boxes[iBox] -= apple;
            }

            if(boxes[iBox] > Integer.valueOf(arrBoxCap[iBox]) || boxes[iBox] < 0) {
                System.out.println(iBox + 1);
                return;
            }
        }

        System.out.println("0");


    }
}
