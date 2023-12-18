import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int n = s.length();
        char ss , tt;
        int a = 0;
        for(int i = 0;i < n;i++){
            ss = s.charAt(i);
            tt = t.charAt(i);
            if(ss != tt){
                a++;
            }
        }
        System.out.println(a);
        sc.close();
    }
}