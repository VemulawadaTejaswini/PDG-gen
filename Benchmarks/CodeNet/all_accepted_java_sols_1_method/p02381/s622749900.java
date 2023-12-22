import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int cnt = input.nextInt();
            if(cnt == 0)
                break;
            double[] grade = new double[cnt];
            double sum = 0;
            double ave = 0;
            double a = 0;
            for(int i = 0; i < cnt; i ++ ){
                grade[i] = input.nextDouble();
                sum += grade[i];
            }
            ave = sum / cnt;
            for(int j = 0; j < cnt; j ++ ){
                a += ((grade[j] - ave) * (grade[j] - ave));
            }
            a = Math.sqrt(a / cnt);
            System.out.println(a);
        }
    }
}
