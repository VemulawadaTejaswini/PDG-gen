import java.util.Scanner;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        //double[] v = new double[n];
        PriorityQueue<Double> v = new PriorityQueue<Double>();
        for(int i = 0;i < n;i++){
            v.add(stdIn.nextDouble());
        }
        while(v.size() >= 2){
            double x = v.poll();
            double y = v.poll();
            v.add((x+y)/2);
        }
        System.out.println(v.peek());
        
        
    }

}