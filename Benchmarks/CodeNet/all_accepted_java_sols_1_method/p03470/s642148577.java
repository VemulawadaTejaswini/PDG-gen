import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        
        ArrayList<Integer> d = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            d.add(Integer.parseInt(sc.next()));
        }
        
        List<Integer> d_sorted = new ArrayList<Integer>(new HashSet<>(d));
        Collections.sort(d_sorted, Comparator.reverseOrder());
        
        System.out.println(d_sorted.size());
    }
}