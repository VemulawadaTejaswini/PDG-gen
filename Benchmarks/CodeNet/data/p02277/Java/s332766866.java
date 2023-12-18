import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int n = Integer.parseInt(br.readLine());
        final Card[] A = new Card[n];
        
        for(int i = 0; i < n; i++){
            A[i] = new Card(br.readLine(), i);
        }

        quickSort(A, 0, n-1);
        System.out.println(isStable(A)?"Stable":"Not stable");
        for(Card c : A){
            System.out.println(c.toString());
        }
    }

    static boolean isStable(Card[] A){
        for(int i=1; i<A.length; i++){
            if(A[i].getNum()==A[i-1].getNum() && A[i].getId()<A[i-1].getId()) return false;
        }
        return true;
    }

    static void quickSort(Card[] A, int p, int r){
        if(p<r){
            int q = partition(A, p, r);
            quickSort(A, p, q-1);
            quickSort(A, q+1, r);
        }
    }

    static int partition(Card[] A, int p, int r){
        final int x = A[r].getNum();
        int i = p-1;
        for(int j=p; j<r; j++){
            if(A[j].getNum()<=x){
                i++;
                swap(A,i,j);
            }
        }
        swap(A,i+1,r);
        return i+1;
    }

    public static void swap(Card[] A, int a, int b){
        Card t = A[a];
        A[a] = A[b];
        A[b] = t;
    }

}

class Card{
    final String str;
    final int num;
    final int id;

    Card(String s, int id){
        this.str = s;
        this.num = Integer.parseInt(s.substring(2));
        this.id = id;
    }

    final public int getNum(){
        return num;
    }

    final public int getId(){
        return id;
    }

    final public String toString(){
        return str;
    }
}

