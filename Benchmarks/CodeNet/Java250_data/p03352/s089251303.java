import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        
        int X = sc.nextInt();
        sc.close();

        int a = (int)Math.sqrt(X);

        int b = (int)(Math.log(X)/Math.log(2));

        int max = 0;
        loop: for(int i = 1; i <= a; i++){
            for(int j = 2; j <= b; j++){
                if(Math.pow(i, j) > X)
                    continue loop;
                else
                    max = Math.max(max, (int)Math.pow(i, j));
            }
        }
        if(X == 1 || X == 2 || X == 3){
            System.out.println(1);
        } else {
            System.out.println(max);
        }
    }
}