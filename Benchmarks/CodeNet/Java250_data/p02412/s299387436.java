import java.io.*;
import java.util.*;

class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        while(true){
            int s = 0;
            int n = scan.nextInt();
            int x = scan.nextInt();
            
            if(n == 0){
                break;
            }
            
            for(int i = 1; i <= n; ++i){
                for(int j = i + 1; j <= n; ++j){
                    for(int k = j + 1; k <= n; ++k){
                        if(i + j + k == x){
                            ++s;
                        }
                    }
                }
            }
            
            System.out.println(s);
        }
    }
}