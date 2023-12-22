import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

class Main{
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                int N = scan.nextInt();
                ArrayList<Integer> card = new ArrayList<Integer>();
                //ArrayList<Integer> alice = new ArrayList<Integer>();
                //ArrayList<Integer> bob = new ArrayList<Integer>();
                int i;
                for(i=0;i<N;i++)card.add(scan.nextInt());
                Collections.sort(card);
                int A=0,B=0;
                for(i=N-1;;){
                        //alice.add(card.get(i));
                        A += card.get(i);
                        i--;
                        //System.out.println(i);
                        if(i==-1)break;
                        //bob.add(card.get(i));
                        B += card.get(i);
                        i--;
                        //System.out.println(i);

                        if(i==-1)break;
                }
                System.out.println(A-B);
        }
}
