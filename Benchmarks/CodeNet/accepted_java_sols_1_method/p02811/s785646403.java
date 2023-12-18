import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        if(n*500>=target)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    }