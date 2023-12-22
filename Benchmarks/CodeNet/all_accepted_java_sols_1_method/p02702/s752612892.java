import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] remainder_mapping = new int[2019];
        remainder_mapping[0]++;
        Scanner sc = new Scanner(System.in);
        String target_string = sc.next();
        int remainder = 0;
        int pow_of_ten = 1;
        for(int i = target_string.length()-1 ;i >= 0; i--){
            int target_number = (target_string.charAt(i) - '0');
            remainder += target_number*pow_of_ten;
            remainder %= 2019;
            remainder_mapping[remainder]++;
            pow_of_ten *= 10;
            pow_of_ten %= 2019;
        }
        int answer = 0;
        for(int i = 0;i < 2019;i++){
            int candidates = remainder_mapping[i];
            if(candidates != 1){
                answer += ((candidates-1)*candidates)/2;
            }
        }
        System.out.println(answer);
    }
}