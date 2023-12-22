import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] alp = s.toCharArray();
        int a = (int)(alp[0]);
        alp[0] = (char)(a+1);
        System.out.print(alp[0]);
    }
}