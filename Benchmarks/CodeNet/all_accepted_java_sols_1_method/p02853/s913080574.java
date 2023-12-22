import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        if(a == 1 && b== 1){
            System.out.println(1000000);
        }else {
            int x = 0;
            if(a == 1){
                x += 300000;
            }else if(a == 2){
                x += 200000;
            } else if(a == 3){
                x+= 100000;
            }
            if(b == 1){
                x += 300000;
            }else if(b == 2){
                x += 200000;
            } else if(b == 3){
                x+= 100000;
            }
            System.out.println(x);
        }
        
    }

}