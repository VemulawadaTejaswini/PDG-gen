import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        for(int i = 0; i < 5; i++){
            if(scan.nextInt() == 0){
                System.out.println(i + 1);
                return;
            }
        }
        scan.close();
    }
}