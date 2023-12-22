import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch=in.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("A");
        }else{
            System.out.println("a");
        }
    }
}