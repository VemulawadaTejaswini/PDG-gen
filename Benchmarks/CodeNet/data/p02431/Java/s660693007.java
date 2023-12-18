import java.util.*;

public class MyClass{  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> sales = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int count = 0;
            
            switch(a){
                case 0:
                    sales.add(sc.nextInt());
                    count ++;
                    break;
                case 1:
                    System.out.println(sales.get(sc.nextInt()));
                    break;
                case 2:
                    sales.remove(sales.size() -1);
                    break;                        
            }
        }
    }
}
