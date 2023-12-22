import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        
        int[] colors = new int[8];
        int free_color = 0;
        
        for(int i=0; i<N; i++){
            int a = Integer.parseInt(sc.next());
            if(1 <= a && a <= 399){
                colors[0] = 1;
            }
            if(400 <= a && a <= 799){
                colors[1] = 1;
            }
            if(800 <= a && a <= 1199){
                colors[2] = 1;
            }
            if(1200 <= a && a <= 1599){
                colors[3] = 1;
            }
            if(1600 <= a && a <= 1999){
                colors[4] = 1;
            }
            if(2000 <= a && a <= 2399){
                colors[5] = 1;
            }
            if(2400 <= a && a <= 2799){
                colors[6] = 1;
            }
            if(2800 <= a && a <= 3199){
                colors[7] = 1;
            }
            if(3200 <= a){
                free_color++;
            }
        }
        
        int ans = 0;
        for(int i=0; i<8; i++){
            ans += colors[i];
        }
        
        if(ans == 0){
            System.out.println(1 + " " + free_color);
        }else{
            System.out.println(ans + " " + (free_color + ans));    
        }
    }
}