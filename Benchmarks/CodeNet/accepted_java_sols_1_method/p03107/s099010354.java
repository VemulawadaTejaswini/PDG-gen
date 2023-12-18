import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String temp = sc.nextLine();
        String[] tempArr = temp.split("");
        int cnt1 = 0,cnt2 = 0;
        for(String str : tempArr) {
            if (str.equals("0")) {
                cnt1++;
            }else {
                cnt2++;
            }
        }

        System.out.println(Math.min(cnt1,cnt2) * 2);


    }

}
