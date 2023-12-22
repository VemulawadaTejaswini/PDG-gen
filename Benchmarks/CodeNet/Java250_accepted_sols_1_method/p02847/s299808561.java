import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        String[] week = {"SAT","FRI","THU","WED","TUE","MON","SUN"};
        for(int i=0; i<week.length; i++) {
            if(s.equals(week[i])) System.out.println(i+1);
        }
    }
}