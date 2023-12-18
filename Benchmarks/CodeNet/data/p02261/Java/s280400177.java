import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] line = getContents().get(1).split(" ");
        Function<String[], Card[]> getCard = xs -> Arrays.stream(xs).map(expr -> new Card(expr, Character.getNumericValue(expr.charAt(1)))).toArray(Card[]::new);
        
        Card[] A = bubble(getCard.apply(line));
        Card[] B = selected(getCard.apply(line));
        
        System.out.println(Arrays.stream(A).map(card -> card.expr).collect(Collectors.joining(" ")));
        System.out.println("Stable");
        System.out.println(Arrays.stream(B).map(card -> card.expr).collect(Collectors.joining(" ")));
        System.out.println(Arrays.equals(A, B) ? "Stable" : "Not stable");
    }
    
    public static ArrayList<String> getContents() throws IOException{
        String line;
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while((line = br.readLine()) != null) list.add(line);
        
        return list;
    }
    
    public static Card[] bubble(Card[] A){
        int n = A.length - 1;;
        boolean flag = true;
        int i = 0;
        while(flag){
            flag = false;
            for(int j = n; j >= i + 1; --j){
                int k = j - 1;
                if(A[j].num < A[k].num){
                    flag = true;
                    swap(A, j, k);
                }
            }
            ++i;
        }
        return A;
    }
    
    public static Card[] selected(Card[] A){
        int minj = 0;
        for(int i = 0, n = A.length - 1; i < n; ++i){
            minj = minIndex(A, i);
            swap(A, i, minj);
        }
        return A;
    }
    
    public static int minIndex(Card[] A, int i){
        int j = i;
        for(int len = A.length; i < len; ++i)
            if(A[i].num < A[j].num) j = i;
        return j;
    }
    
    public static void swap(Card[] A, int i, int j){
        Card v = A[j].clone();
        A[j] = A[i].clone();
        A[i] = v;
    }
    

}

class Card{
    public String  expr;
    public int     num;
    public Card(String _expr, int _num){
        this.expr = _expr;
        this.num  = _num;
    }
    public Card clone() {
        return new Card(this.expr, this.num);
    }    
}

