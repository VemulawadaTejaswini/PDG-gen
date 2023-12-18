import javax.smartcardio.Card;
import java.util.Scanner;

public class Main {
    static class card{
        public String  suit;
        public int value;

        public card(String suit, int value) {
            this.suit = suit;
            this.value = value;
        }
    }

    public static void swap(card a[],int i,int j){
        card tmp;
        tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;

    }

        public static void bubbleSort(card c[]){
            for (int i=0; i < c.length; i++){
                for (int j = i+1; j < c.length; j++){
                    if (c[i].value > c[j].value){
                        swap(c,i,j);
                    }
                }
            }
        }

        public static void selectSort(card c[]){
            for (int i = 0; i < c.length; i++){
                int minIdex = i;
                for (int j = i; j < c.length; j++){
                    minIdex = c[j].value <= c[minIdex].value ? j : minIdex;
                }
                    swap(c, minIdex, i);
            }
        }

        public static boolean isStable(card c1[],card c2[]){
            for (int i = 0; i < c1.length; i++){
                if (c1[i].suit != c2[i].suit){
                    return false;
                }
            }
            return true;
        }

        public static void print(card c[]){
            System.out.print(c[0].suit + c[0].value);
            for (int i = 1; i < c.length; i++){
                System.out.print(" " + c[i].suit + c[i].value);
            }
            System.out.println();
        }

    public static card[] copy(card c[]){
            card cc[] = new card[c.length];
            for (int i = 0; i < c.length; i++){
                cc[i] = c[i];
            }
            return cc;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        card c[] = new card[n];
        for (int i = 0; i < n; i++){
            String s = in.next();
            String suit = s.substring(0,1);
            int value = Integer.parseInt(s.substring(1,2));
          //  System.out.println(suit+value);
            c[i] = new card(suit,value);
        }
        card[] cc = copy(c);
        bubbleSort(c);
        print(c);
        System.out.println("Stable");

        selectSort(cc);
        print(cc);
        if (isStable(c,cc) == true){
            System.out.println("Stable");
        }
        else {
            System.out.println("Not stable");
        }
    }
}


