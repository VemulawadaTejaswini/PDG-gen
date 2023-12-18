import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n % 10;
        if(num == 3){
            System.out.println("bon");
        }else if(num == 0 || num == 1 || num == 6 || num == 8){
            System.out.println("pon");
        }else{
            System.out.println("hon");
        }
    }
}