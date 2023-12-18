import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        //init
        int n = 0, x = 0;

        while(true){
            n = Integer.parseInt(in.next());
            x = Integer.parseInt(in.next());

            if(n == 0)break;

            int cnt = 0;

            for(int i = n; i >= 3; i--){
                for(int j = i - 1; j >= 2; j--){
                    int remainder = x - i - j;
                    if(remainder <= 0)continue;
                    else if(remainder >= j || remainder >= i)break;
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}
