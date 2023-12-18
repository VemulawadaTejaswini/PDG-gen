import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        while(tan.hasNext()){
            char ch=tan.next().charAt(0);
            if(ch>='A' && ch<='Z')
                System.out.println("A");
            else
                System.out.println("a");
        }
    }
}
