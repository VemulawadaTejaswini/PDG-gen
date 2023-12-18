import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
 
 //   System.out.println(calc(2,3));
 
    while(x != 0 && y != 0){
        if(x >= y){
            x = calc(x, y);
        }else{
            y = calc(y, x);
        }
    }
    //System.out.println(x + " " + y);
    if(x == 0){
        System.out.println(y);
    }else{
        System.out.println(x);
    }
   
    }
    
    public static int calc(int a, int b){
        return a % b;
    }
}
