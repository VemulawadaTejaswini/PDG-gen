import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner in = new Scanner(System.in);
        int square = in.nextInt();
        int[] height = new int[square];
                
        int tmpmove = 0;
        int maxmove = 0;
        for (int i = 0;i < square;i++) {
            height[i] = in.nextInt();
            
            if (i == 0){
                continue;
            } 
            //System.out.println(height[i] + " " + tmpmove);
            if (height[i-1] >= height[i]){
                tmpmove++;
                if (maxmove < tmpmove){
                    maxmove = tmpmove;
                }
            }else{
               tmpmove = 0;
            }
           
        }

        System.out.println(maxmove);

    }
}
