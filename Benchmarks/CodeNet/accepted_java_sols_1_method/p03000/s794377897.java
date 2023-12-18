import java.util.*;
import java.lang.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int d =0;
        int count =1;
        for(int i = 0; i < n; i++){
            d = d + sc.nextInt();
            if(d <= x){
                count ++;
            }else if(d >x){
                break;
            }
        }
        System.out.println(count);

    }
}