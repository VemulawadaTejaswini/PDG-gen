import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        int a,l,j,p=0;
        a=tan.nextInt();
        l=tan.nextInt();
        if(l%2==0 && (a*2<=l && a*4>=l))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
