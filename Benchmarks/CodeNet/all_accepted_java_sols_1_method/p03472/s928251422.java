import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long h = sc.nextInt();
        
        List<Long> a = new ArrayList<Long>();
        List<Long> b = new ArrayList<Long>();
        
        for(int i = 0; i < n; i++){
            a.add(sc.nextLong());
            b.add(sc.nextLong());
        }
        
        long res = 0;
        
        Collections.sort(a, Comparator.reverseOrder());
        Collections.sort(b, Comparator.reverseOrder());
        
        for(int i = 0; i < n; i++){
            if(h <= 0 || a.get(0) > b.get(i)) break;
            h-=b.get(i);
            res++;
        }
        
        while(true){
            if(h <= 0) break;
            h-=a.get(0);
            res++;
        }
        
        System.out.println(res);
    }
}
