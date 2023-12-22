import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] ss = {"Sunny","Cloudy","Rainy"};
        int i =0;
        for(; i<ss.length; i++) {
            if(s.equals(ss[i])) break;
        }
        if(i >= 2) System.out.println(ss[0]);
        else System.out.println(ss[i+1]);
    }
}
