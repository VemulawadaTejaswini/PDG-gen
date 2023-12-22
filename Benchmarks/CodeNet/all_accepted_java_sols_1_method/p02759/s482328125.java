import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if((N%2)==0){
            System.out.println(N/2);
        }else{
            System.out.println(N/2+1);
        }
    }
}