import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int hai = 0;
        int cha = 0;
        int midori = 0;
        int mizu = 0;
        int ao = 0;
        int ki = 0;
        int daidai = 0;
        int aka = 0;
        int free = 0;
        
        for(int i = 0; i < N; i++){
          int a = sc.nextInt();
          if(a >= 1 && a <= 399 && hai == 0){
            hai++;
          }else if(a >= 400 && a <= 799 && cha == 0){
            cha++;
          }else if(a >= 800 && a <= 1199 && midori == 0){
            midori++;
          }else if(a >= 1200 && a <= 1599 && mizu == 0){
            mizu++;
          }else if(a >= 1600 && a <= 1999 && ao == 0){
            ao++;
          }else if(a >= 2000 && a <= 2399 && ki == 0){
            ki++;
          }else if(a >= 2400 && a <= 2799 && daidai == 0){
            daidai++;
          }else if(a >= 2800 && a <= 3199 && aka == 0){
            aka++;
          }else if(a >= 3200){
            free++;
          }  
        }
         
         int Min = hai + cha + midori + mizu + ao + ki + daidai + aka;
         int Max = 0;
         if(Min != 0){
           Max = Min + free;
         }else{
           Min = 1;
           Max = N;
         }
          System.out.println(Min + " " + Max);
        
	}
}