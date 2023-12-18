import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        
        while(true){
            int x = i;
            if(x%3 == 0){
                System.out.print(" " + i);
            }else{
                do{
                    if(x%10 == 3){
                        System.out.print(" " + i);
                    }
                    x /= 10;
                }while(x != 0);
            }
            if(++i>n){
                break;
            }
        }
        System.out.println();
    }
}

