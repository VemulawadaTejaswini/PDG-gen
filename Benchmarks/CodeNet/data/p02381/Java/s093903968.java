import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        int studentNumber;
        Scanner sc = new Scanner(System.in);
        StandardDeviation sd = new StandardDeviation();
        while( !((studentNumber = sc.nextInt()) == 0) ){
            int[] testPoint = new int[studentNumber];
            for(int i = 0; i < studentNumber; i++){
                testPoint[i] = sc.nextInt();
            }
            System.out.println(Math.sqrt(sd.calcOfDispersion(testPoint, sd.calcOfAverage(testPoint))));
        }
    }
}

class StandardDeviation{
    double sum = 0;            //合計値
    double average = 0;        //平均    
    double dispersion = 0;     //分散
    
    //平均の計算
    public double calcOfAverage(int[] testPoint){
        sum = 0;
        for(int i = 0; i < testPoint.length; i++){
            sum += testPoint[i];
        }
        average = sum / testPoint.length;
        return average;
    }
    
    //分散の計算
    public double calcOfDispersion(int[] testPoint, double average){
        sum = 0;
        for(int i = 0; i < testPoint.length; i++){
            sum += Math.pow((testPoint[i] - average), 2);
        }
        dispersion = sum / testPoint.length;
        return dispersion;
    }
}
