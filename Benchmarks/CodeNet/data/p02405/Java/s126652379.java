import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int h =sc.nextInt();
            int w =sc.nextInt();
            if(w==0||h==0) break;
        
            for(int i=1;i<=h;i++){
                for(int j=1;j<=w;j++){
                    if((i+j)%2==0){
                        System.out.printf("#");
                    }else{
                        System.out.printf(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    
}
    
