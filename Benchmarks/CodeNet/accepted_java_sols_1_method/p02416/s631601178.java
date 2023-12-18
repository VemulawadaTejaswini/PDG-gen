import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        while(true){
            String s = in.nextLine();
            if(s.equals("0"))break;

            char[] str = s.toCharArray();
            int sum = 0;

            for(int i = 0; i < str.length; i++){
                sum += str[i] - 48;
            }

            System.out.println(sum);
        }

    }
}
