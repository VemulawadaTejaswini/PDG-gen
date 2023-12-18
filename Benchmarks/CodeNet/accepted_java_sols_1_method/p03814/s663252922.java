import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        String s = new Scanner(System.in).next();
        int b = s.indexOf('A');
        int e = s.lastIndexOf('Z');
        s = s.substring(b,e+1);
        System.out.println(s.length());
    }
}