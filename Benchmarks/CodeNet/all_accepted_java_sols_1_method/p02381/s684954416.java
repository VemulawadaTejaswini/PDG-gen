
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()){
            int studentsNum = sc.nextInt();
            if (studentsNum == 0)
                break;
            double point[] = new double[studentsNum];
            double sum = 0;
            for (int i = 0; i < studentsNum; i++){
                point[i] = sc.nextInt();
                sum += point[i];
            }
            double ave = sum / studentsNum;
            double sm = 0;
            for (int j = 0; j < studentsNum; j++){
                sm += Math.pow(point[j] - ave, 2);
            }
            double aa = sm / studentsNum;
            double result = Math.sqrt(aa);
            System.out.println(result);
        }
    }
}

