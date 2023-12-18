import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();
    
            for(int i = 0;i<x;i++){
                for(int j = 0;j<y;j++){
                    System.out.printf("#");
                }
                System.out.printf("\n");
            }
            if(x==0 && y==0) break;
        }
    }
}
