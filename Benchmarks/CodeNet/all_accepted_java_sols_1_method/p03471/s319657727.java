import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int Y = sc.nextInt();

                int x,y,z;
                boolean ch=false;
                for(x=0; x<=N; x++){
                        for(y=0; y<=N-x; y++){
                                z = N - x - y;
                                ch = 10000 * x + 5000 * y + 1000 * z == Y;
                                if(ch){
                                        System.out.print(x+" "+y+" "+z);
                                        break;
                                }
                        }
                        if(ch)break;
                }
                if(!ch)System.out.print("-1 -1 -1");
        }
}
