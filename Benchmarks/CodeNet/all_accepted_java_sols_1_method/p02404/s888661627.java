import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int height = sc.nextInt();
            int weight = sc.nextInt();
            
            if( height == 0 && weight == 0 ) break;
            for(int h = 0; h < height; h++){
                for(int w = 0; w < weight; w++){
                    if( h == 0 || h == height-1 || w == 0 || w == weight-1){
                        System.out.print("#");    
                    }else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
