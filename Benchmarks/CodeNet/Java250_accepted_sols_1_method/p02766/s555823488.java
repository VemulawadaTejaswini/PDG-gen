import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        for(int i = 1; i <= 50; i++){
            if(n < Math.pow(k, i)){
                System.out.println(i);
                return;
            }
        }
        scan.close();
    }
}