import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            int height = sc.nextInt();
            int weight = sc.nextInt();
            
            if(height == 0 && weight == 0) break;
        
            for(int i = 0; i < height; i++){
                for(int j = 0; j < weight; j++){
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

