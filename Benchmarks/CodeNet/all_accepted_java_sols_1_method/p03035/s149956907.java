import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(13<=A){
            System.out.println(String.valueOf(B));
        }else if(6 <= A){
            System.out.println(String.valueOf(B/2));
        }else{
            System.out.println(String.valueOf(0));
        }
    }
}