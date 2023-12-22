import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N  = scanner.nextInt();
        int[] count = new int[8];
        int over = 0;
        for(int i=0;i<8;i++){
            count[i] = 0;
        }
        for(int i=0; i<N; i++){
            int a = scanner.nextInt();
            if(a <= 399){
                count[0] = Math.min(1, count[0] + 1); 
            }else if(a<=799){
                count[1] = Math.min(1, count[1] + 1); 
            }else if(a<=1199){
                count[2] = Math.min(1, count[2] + 1); 
            }else if(a<=1599){
                count[3] = Math.min(1, count[3] + 1);
            }else if(a<=1999){
                count[4] = Math.min(1, count[4] + 1);
            }else if(a<=2399){
                count[5] = Math.min(1, count[5] + 1);
            }else if(a<=2799){
                count[6] = Math.min(1, count[6] + 1);
            }else if(a<=3199){
                count[7] = Math.min(1, count[7] + 1);
            }else{
                over++;
            }
        }
        int min = 0;
        for(int i=0; i<8; i++){
            min += count[i];
        }
        int max = min+over;
        if(min==0 && over>=1){
            min=1;
        }
        System.out.println(String.valueOf(min) + " " + String.valueOf(max));
    }
}