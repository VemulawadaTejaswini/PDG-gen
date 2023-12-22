import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        if(x == 3 || x == 5 || x == 7)
            System.out.println("YES");
        else System.out.println("NO");
    }
}