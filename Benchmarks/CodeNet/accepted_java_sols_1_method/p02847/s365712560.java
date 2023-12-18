import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sArray[] = { "SUN","MON","TUE","WED","THU","FRI","SAT" };
        int index = Arrays.asList(sArray).indexOf(s);
        System.out.print(7 - index);
    }
}