import java.util.*;

public class Main{  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> sales = new HashMap<>();
        
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            
            switch(a){
                case 0:
                    sales.put(sc.next(),sc.nextInt());
                    break;
                case 1:
                    System.out.println(sales.getOrDefault(sc.next(),0));
                    break;
                case 2:
                    sales.remove(sc.next());
                    break;
            }
        }
    }
}
