//package beginner176;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String s = in.next();

        int cnt = 0;
        int len = s.length();
        for(int i = 0; i < len; i++){
            cnt += s.charAt(i) - '0';
        }
        if(cnt % 3 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
