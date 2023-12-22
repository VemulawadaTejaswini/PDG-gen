import java.util.*;
 
public class Main {
    public static void main(String args[]) {
       //値の取得
       Scanner sc = new Scanner(System.in);
       int[] time = new int[5];
       for(int i = 0; i < 5; ++i){
           time[i] = sc.nextInt();
       }
       
       int dish[] = new int[5];
       
       for(int i = 0; i < 5; ++i){
           if(time[i]%10==0){
               dish[i] = (time[i]/10)*10;
           }else{
               dish[i] = (time[i]/10)*10 +10;
           }
       }
       
       int max = 0;
       int total = 0; 
       for(int i = 0; i < 5; ++i) {
           if(Math.abs(dish[i] - time[i]) > max) {
               max = Math.abs(dish[i] - time[i]); 
           }
           
           total += dish[i];
       }
       System.out.println(total - max);
    }
}