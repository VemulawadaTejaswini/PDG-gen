import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        long f=0;
        for(int i=0; i<s1.length();i++)
        {
            f+=(s1.charAt(i)-'0');
        }
        if(f % 9 == 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    }
