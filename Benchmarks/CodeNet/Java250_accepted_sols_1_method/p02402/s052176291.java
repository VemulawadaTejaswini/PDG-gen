import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws java.io.IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dataset = new int[n];
        for (int i=0;i<n;i++){
            dataset[i] =  sc.nextInt();
        }
        sc.close();
        long sum = 0;

        for (int elem : dataset){
            sum += elem;
        }
        Arrays.sort(dataset);
        System.out.println(dataset[0] + " " +  dataset[dataset.length-1]+ " "+sum);
    }
}