import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            StandardDeviation standard = new StandardDeviation();
            int n = sc.nextInt();
            int numbers[] = new int[n];
            if(n == 0){
                break;
            }else{
                for(int i = 0; i < n; i++){
                    numbers[i] = sc.nextInt();
                }
            }
            double average = standard.average(n, numbers);
            double dispersion = standard.dispersion(n,average,numbers);
            System.out.println(String.format("%f", dispersion));

        }
            
    }
}

class StandardDeviation{
    public double average(int n,int numbers[]){
        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += numbers[i];
        }
    return sum / n;
    }
    
    public double dispersion(int n, double average,int numbers[]){
        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += Math.pow(numbers[i] - average,2);
        }
    return Math.sqrt(sum / n);
    }
}
