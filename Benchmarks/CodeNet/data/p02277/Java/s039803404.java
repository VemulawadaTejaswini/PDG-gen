import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String [] ls = new String[n];
        HashMap<String, Integer> ids = new HashMap<>();
        for(int x = 0; x < n; x++){
            String card = scan.next() + " ";
            card = card + scan.next();
            ls[x] = card;
            ids.put(ls[x], x);
        }
        quicksort(ls, 0, n - 1);
        boolean stable = true;
        for(int x =0; x < n - 1; x++){
            if(stable && Integer.parseInt(ls[x].substring(2, 3)) == Integer.parseInt(ls[x + 1].substring(2,3))){
                if(ids.get(ls[x]) > ids.get(ls[x + 1])){
                    stable = false;
                    x = n;
                }
            }
        }
        if(stable){
            System.out.println("Stable");
        }
        else{
            System.out.println("Not stable");
        }
        for (String x: ls){
            System.out.println(x);
        }
    }
    public static int partition(String [] A, int p, int r){
        String X = A[r];
        int x = Integer.parseInt(A[r].substring(2, 3));
        int i = p;
        for(int j = p; j < r; j++){
            if(Integer.parseInt(A[j].substring(2, 3)) <= x){
                String hold = A[i];
                A[i] = A[j];
                A[j] = hold;
                i = i++;
            }
        }
        A[r] = A[i];
        A[i] = X;
        return i;
    }

    public static void quicksort(String [] A, int p, int r){
        if(p < r){
            int q = partition(A, p, r);
            quicksort(A, p, q - 1);
            quicksort(A, q + 1, r);
        }
    }
}
