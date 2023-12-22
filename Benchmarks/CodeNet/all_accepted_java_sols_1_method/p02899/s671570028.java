import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(n);
        
        for(int i = 0; i < n; i++){
            map.put(sc.nextInt(), i + 1);
        }
        
        for(int j = 1; j <= n; j++){
            if(j > 1){
                System.out.print(" ");
            }
            System.out.print(map.get(j));
        }
        
    }
}
