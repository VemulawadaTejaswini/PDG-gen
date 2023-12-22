import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        for (int i = 2;i <= 31;++i){
            int k = i * i;
            while (k <= 1000){
                nums.add(k);
                k *= i;
            }
        }
        int max = 1;
        for (int i = 0;i < nums.size();++i){
            int o = nums.get(i);
            if(o <= x&&o > max){
                max = o;
            }
        }
        System.out.println(max);





    }

}