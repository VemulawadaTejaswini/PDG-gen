import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
            
        int count = sc.nextInt();
        int max = 0;
        int total = 0;
    
        for(int i=0 ; i<count;i++){
            
            int tmp = sc.nextInt();
            total += tmp;
            
            if(max < tmp){
                max = tmp;
            }
        }
        
        if(max >= total - max){
            System.out.println("No");
        }else{
             System.out.println("Yes");
        }
    }
}
