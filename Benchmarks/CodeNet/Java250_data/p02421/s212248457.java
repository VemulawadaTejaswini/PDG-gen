import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int taro_point = 0, hana_point = 0;
        for(int i = 0; i < n ; i++){
            int compared = in.next().compareTo(in.next());

            if(compared == 0){
                taro_point++;
                hana_point++;
            }
            else if(compared > 0) taro_point += 3;
            else hana_point += 3;
        }

        System.out.printf("%d %d\n", taro_point, hana_point);
    }
}
