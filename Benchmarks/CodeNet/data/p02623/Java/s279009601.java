import java.util.Scanner;
import java.util.ArrayList;
        
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        
        int n = Integer.valueOf(scanner.next());
        int m = Integer.valueOf(scanner.next());
        int k = Integer.valueOf(scanner.next());
        
        System.out.println("\n");
        
        int aValue = 0;
        for(int i = 0; i < n; i++) {
            aValue = Integer.valueOf(scanner.next());
            a.add(aValue);
        }
        
        System.out.println("\n");
        
        int bValue = 0;
        for(int j = 0; j < m; j++) {
            bValue = Integer.valueOf(scanner.next());
            b.add(bValue);
        }
        
        int l = 0;
        int z = 0;
        while(true) {
            
            if(a.isEmpty() && b.isEmpty()) {
                break;
            }
            
            if(a.isEmpty() && !(b.isEmpty())) {
                l += b.get(0);
                b.remove(0);
            } 
            
            if(b.isEmpty() && !(a.isEmpty())) {
                l += a.get(0);
                a.remove(0);
            } 
            
            if(!(a.isEmpty() || b.isEmpty())) {
                if(a.get(0) < b.get(0)) {
                    l += a.get(0);
                    a.remove(0);
                }else {
                    l += b.get(0);
                    b.remove(0);
                }
            }
            
            if(l > k) {
                break;
            }
            
            z++;
        }
        
        System.out.println(z);
    }
}