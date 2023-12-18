
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long start = in.nextLong();
        long nSteps = in.nextLong();
        long hop = in.nextLong();
       if(nSteps> 10000){
          if(nSteps%2==0){
              nSteps = 100;
          } else{
              nSteps = 101;
          }
       }
        for (int i = 0; i < nSteps; i++) {
            start =(start > 0) ? (start - hop) : (start + hop);
        }
        System.out.println(Math.abs(start));
    }
}
