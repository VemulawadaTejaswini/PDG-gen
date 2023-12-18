import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int XFirstDigits = X / 100;
        int XLastTwoDigits = X % 100;
        if(XFirstDigits * 5 >= XLastTwoDigits){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
