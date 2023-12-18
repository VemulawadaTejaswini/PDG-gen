

import java.util.*;


public class Main {

    
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    int N = scanner.nextInt();
    double[] nums = new double[N];
    for(int i= 0 ; i<N;i++){
    nums[i] = scanner.nextDouble();
    }
    double product = 1;
    for(int i = 0 ; i<N;i++){
    product*= nums[i];
    }
    if(product>Math.pow(10,18)){
        System.out.println("-1");
    } else{
        System.out.printf(" %.0f\n",product);
    }
    }
    
}