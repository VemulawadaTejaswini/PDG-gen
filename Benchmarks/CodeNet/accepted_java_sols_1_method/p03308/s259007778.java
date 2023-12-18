import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =Integer.parseInt(sc.next());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < N ;i++){
            int in = Integer.parseInt(sc.next());
            if(min > in){
                min = in;
            }
            if(max < in){
                max = in;
            }
        }
        System.out.println(max-min);
    }
}