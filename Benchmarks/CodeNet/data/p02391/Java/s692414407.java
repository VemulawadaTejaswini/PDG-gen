import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        switch((int)Math.signum(y-x)){
            case 1:
                System.out.println("a < b");
                break;
            case 0:
                System.out.println("a == b");
                break;
            case -1:
                System.out.println("a > b");
                break;
        }
    }
}
