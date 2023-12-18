import java.util.Scanner;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        long m = stdIn.nextLong();
        long d = stdIn.nextLong();

        int count= 0;
        for(int i = 1;i <= m;i++){
            for(int j = 1;j <= d;j++) {
                if(j >= 22) {
                    if(j%10 >= 2 && (j/10)*(j%10) == i){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

        
    }

}