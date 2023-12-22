import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int flag = 0;
        for(int i=0 ; i<=x ; i++){
            if((2*x+2*i)==y){
                System.out.println("Yes");
                flag=1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("No");
        }
        
    }
}
