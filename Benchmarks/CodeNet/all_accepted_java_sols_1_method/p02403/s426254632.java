import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n == 0 && m == 0){
                break;
            }else{
                for(int i = 0; i < n; i++){
                    for(int j = 0; j < m; j++){
                        System.out.print("#");
                        
                    }
                    System.out.println("");
                }
                
            }
            System.out.println();
            
        }
    }
}
