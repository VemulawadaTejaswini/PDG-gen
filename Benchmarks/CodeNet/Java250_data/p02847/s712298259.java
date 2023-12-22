import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> list = new ArrayList<>(Arrays.asList("SUN","MON","TUE","WED","THU","FRI","SAT"));

        System.out.println(7 - list.indexOf(s));
    }

}