import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] t = {"Sunny", "Cloudy", "Rainy"};
        String s = sc.next();

        int n;
        if(s.equals("Sunny")) {
        	n = 1;
        }else if(s.equals("Cloudy")) {
        	n = 2;
        }else {
        	n = 0;
        }

        System.out.println(t[n]);

        return;
    }

}