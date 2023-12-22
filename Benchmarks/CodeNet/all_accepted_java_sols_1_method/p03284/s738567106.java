import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        if(n%k==0){
            System.out.print("0");
        }else{
            System.out.print("1");
        }
    }
}