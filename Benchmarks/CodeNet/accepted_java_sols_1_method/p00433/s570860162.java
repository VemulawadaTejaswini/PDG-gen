import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Atest[] = new int[4];
        int Btest[] = new int[4];
        
        int Asum = 0, Bsum = 0;
        
        for(int i=0; i<4; i++){
            Atest[i] = sc.nextInt();
    	}
        for(int i=0; i<4; i++){
         	Btest[i] = sc.nextInt();   
        }
        
        for(int i=0; i<4; i++){
            Asum += Atest[i];
            Bsum += Btest[i];
        }
        
        if(Asum > Bsum){
        	System.out.println(Asum);
        }else if(Asum < Bsum){
         	System.out.println(Bsum);   
        }else{
         	System.out.println(Asum);   
        }
    }
}
