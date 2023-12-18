import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        char[] str = in.nextLine().toCharArray();

        for(int i = 0; i < str.length; i++){
            if(str[i] >= 65 && str[i] <= 90) str[i] += 32;
            else if(str[i] >= 97 && str[i] <= 122)str[i] -= 32;

            System.out.print(str[i]);
        }
        System.out.println();

    }
}
