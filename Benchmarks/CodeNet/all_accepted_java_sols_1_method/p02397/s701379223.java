import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i <= 3000;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == 0 && y == 0){
                break;
            }
            if(x <= y){
                System.out.println(x + " " + y);
            }else{
                System.out.println(y + " " + x);
            }
            
        }
    }
}
