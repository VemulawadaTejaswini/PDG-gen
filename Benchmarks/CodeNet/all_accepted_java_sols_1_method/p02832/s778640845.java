import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList <Number> list = new ArrayList<>();
        int count = 1;
        
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x == count){
                count++;
            }
            list.add(x);
        }
        
        if(count==1){
            System.out.println("-1");
        }else{
            System.out.println(n-count+1);
        }
   }
}
