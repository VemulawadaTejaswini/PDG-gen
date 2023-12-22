import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int inum = n/100;
        String str = ""+inum+inum+inum;
        int xxx = Integer.parseInt(str);
        if(xxx < n) xxx += 111;
        System.out.println(xxx);
    }
}