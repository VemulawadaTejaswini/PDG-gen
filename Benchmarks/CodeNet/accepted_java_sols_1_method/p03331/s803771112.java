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
                int min=10000000;
                int a,b,sum,tens;

                for(int j=1; j<=N/2; j++){
                        a = j;
                        b = N - a;
                        sum = 0;
                        while(a != 0){
                                sum += a % 10;
                                a /= 10;
                        }
                        while(b != 0){
                                sum += b % 10;
                                b /= 10;
                        }
                        if(min>sum){
                                min = sum;
                        }
                }
                System.out.println(min);
        }
}
