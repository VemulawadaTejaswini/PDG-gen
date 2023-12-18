import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0){break;}
            else{
                int x = n/1000;
                int y = n/100-10*x;
                int z = n/10-100*x-10*y;
                int w = n%10;
                System.out.println(x+y+z+w);
            }
        }
    }
}
