import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder stb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            stb.append('x');
        }
        System.out.println(stb.toString());
    }
}