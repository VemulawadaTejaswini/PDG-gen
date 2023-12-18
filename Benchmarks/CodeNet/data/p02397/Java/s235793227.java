import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       
        for(int i=0;true;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x!=0&&y!=0){
                if(x<=y){
                    System.out.println(x+" "+y);
                }else{
                    System.out.println(y+" "+x);
                }
        
                
            }else{
                break;
            }
        }
    }
}

