
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count = 0;
        switch(s){
            case "RSS":
            case "SRS":
            case "SSR":
            case "RSR":
                count = 1;
                break;
            case "RRS":
            case "SRR":
                count = 2;
                break;
            case "RRR":
                count = 3;
                break;
        }
        System.out.println(count);
    }
}