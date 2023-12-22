import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Integer x = sc.nextInt();
        Set<Integer> st = new HashSet<Integer>();
        int count = 1;
         
        while(!st.contains(x)){
            st.add(x);
            if(x % 2 == 0){
                x = x/2;
            }else if(x % 2 == 1){
                x = 3 * x + 1;
            }
            count++;
        }     
        System.out.println(count);
    }
}