import java.util.*;

public class Main {
    static final int MOD = 1_000_000_007;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Integer[] i = {2,3,4,5,6,7,8,9,10,11,12,13,1};
        List<Integer> list = Arrays.asList(i);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(list.indexOf(a) > list.indexOf(b)) System.out.println("Alice"); else if(list.indexOf(a) == list.indexOf(b)) System.out.println("Draw"); else System.out.println("Bob");
    }
}
