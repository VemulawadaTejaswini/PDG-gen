import java.util.*;

public class Main{  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Stack<Integer> sales = new Stack<>();
       
        
        while(sc.hasNext()){
            int a = sc.nextInt();
            
            if(a == 0){
                System.out.println(sales.pop());
            }else{
                sales.push(a);
            }
            
        }
    }
}
