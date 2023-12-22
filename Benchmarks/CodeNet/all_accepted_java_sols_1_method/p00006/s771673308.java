import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] list=sc.nextLine().toCharArray();
        int n=list.length;
        while(n-->0) {
            System.out.print(list[n]);
        }
        System.out.println();
        sc.close();
    }
}
