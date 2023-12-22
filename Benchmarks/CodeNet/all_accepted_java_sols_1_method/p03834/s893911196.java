import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String ans = "";
        for(int i = 0;i<a.length();i++){
            if (i == 5 || i == 13)
                ans += " ";
            else
                ans += a.charAt(i);
        }
        System.out.println(ans);
    }
}
