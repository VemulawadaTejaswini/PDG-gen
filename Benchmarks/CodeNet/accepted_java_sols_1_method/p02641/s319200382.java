import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        int p = 0;
        for(int i=0; i<n; i++) {
            p = Integer.parseInt(sc.next());
            list.add(p);
        }
        
        int ans = x;
        int i = 1;
        if(list.contains(x)) {
            while(true) {
                if(list.contains(x-i)) {}
                else {
                    ans = x-i;
                    break;
                }
                if(list.contains(x+i)) {}
                else {
                    ans = x+i;
                    break;
                }
                i++;
            }
        }
        System.out.println(ans);
        
    }
}