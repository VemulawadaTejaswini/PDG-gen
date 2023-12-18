import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int E = sc.nextInt();
            if(E==0)break;
            
            int ans = E;
            
            for(int z=0; z*z*z<=E ;z++){
                int Cz = z*z*z;
                for(int y=0;y*y<=E-Cz;y++){
                    
                    int x = E - Cz - y*y;
                    
                    if(ans>x+y+z){
                        ans = x+y+z;
                    }
                }
            }
            
            System.out.println(ans);
            
        }
        
    }
}