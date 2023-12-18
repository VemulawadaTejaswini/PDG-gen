import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int x = stdIn.nextInt();
        int n = stdIn.nextInt();
        
        boolean flag[] = new boolean[501];
        
        for(int i = 0; i < 501; i++){
            flag[i] = true;
        }
        
        for(int i = 0; i < n; i++){
            flag[250 + stdIn.nextInt()] = false;
        }
        
        
        if(n != 0){
            if(flag[250 + x] != true){
                for(int i = 1; ; i++){
                    if(flag[250 + x - i] == true){
                        System.out.println(x - i);
                        break;
                    }
                    
                    if(flag[250 + x + i] == true){
                        System.out.println(x + i);
                        break;
                    }
                }
            }else{
                System.out.println(x);
            }
        }else{
            System.out.println(x);
        }
        
    }
}
