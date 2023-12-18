import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        

        if(n%2 == 0){
            System.out.println(0.5);
        }else {
            System.out.println((double)(n/2+1)/(double)n);
        }
    }

}