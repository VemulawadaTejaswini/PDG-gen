import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        int X = sc.nextInt();
        while(true){
            boolean check = true;
            for(int i=2;i<Math.sqrt(X);i++){
                if(X%i==0){
                    check =false;
                    X++;
                    break;
                }
            }
            if(check) break;
        }
        System.out.println(X);
    }
}