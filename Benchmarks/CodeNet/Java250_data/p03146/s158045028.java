import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static String T = "";

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList();
        int n = sc.nextInt();
        array.add(n);
        while(true){
            n = function(n);
            if(array.indexOf(n) == -1){
                array.add(n);
            }else{
                System.out.println(array.size() + 1);
                return;
            }
        }
    }

    public static int function(int n){
        if(n % 2 == 0){
            return n / 2;
        }else{
            return 3*n + 1;
        }
    }
}