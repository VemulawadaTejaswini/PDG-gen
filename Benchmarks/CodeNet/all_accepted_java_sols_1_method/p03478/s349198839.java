import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int A = sc.nextInt();
                int B = sc.nextInt();
                int ans = 0,x,y;

                for(int i=1; i<=N; i++){
                        x = i;
                        y = 0;
                        while(x != 0){
                                y += x % 10;
                                x /= 10;
                        }
                        if(y >= A && y <= B){
                                ans += i;
                        }
                }
                System.out.println(ans);
        }
}
