import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        sc.close();
        if(str[2]==str[3] && str[4]==str[5]) System.out.println("Yes");
        else System.out.println("No");
    }
}