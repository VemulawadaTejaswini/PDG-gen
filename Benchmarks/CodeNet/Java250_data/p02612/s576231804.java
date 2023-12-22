import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int counter = 0;
        for(int i = 0; i < 10001; i ++){
                if(i - N >= 0){
                    counter = i - N;
                    System.out.println(counter);
                    break;
                }else{
                    i = i + 999;
                }
            }
    }
}
