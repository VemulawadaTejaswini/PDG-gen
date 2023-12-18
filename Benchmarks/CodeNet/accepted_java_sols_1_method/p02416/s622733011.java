import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
        int digit =0;
        String x=sc.nextLine();
        if(x.equals("0")) break;
        for(int i=0;i<x.length();i++) {
        char c=x.charAt(i);
        digit += c -'0';
        }
        System.out.println(digit);
        }
    }
}
