import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if((i+1)*(j+1)==n){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
        sc.close();
    }
}