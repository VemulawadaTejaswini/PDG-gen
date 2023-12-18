
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0, j = 0;
        String level[] = {"AAA", "AA", "A", "B", "C", "D", "E", "NA"};
        double levelData500[] = {35.5d, 37.5d, 40.0d, 43.0d, 50.0d, 55.0d, 70.0d};
        double levelData1000[] = {71d, 77d, 83d, 89d, 105d, 116d, 148d};
        double inputDataSet1, inputDataSet2;
        Scanner sc = new Scanner(System.in);
        while (true) {
            i = j = 0;
            inputDataSet1 = sc.nextDouble();
            inputDataSet2 = sc.nextDouble();
            while (i < 7) {
                if (inputDataSet1 < levelData500[i]) {
                    break;
                }
                i++;
            }

            while (j < 7) {
                if (inputDataSet2 < levelData1000[j]) {
                    break;
                }
                j++;
            }

            if (i <= j) {
                System.out.println(level[j]);
            } else {
                System.out.println(level[i]);
            }
        }
    }
}