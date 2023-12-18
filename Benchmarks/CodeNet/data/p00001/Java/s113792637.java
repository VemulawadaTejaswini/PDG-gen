import java.util.*;

public class Main{
    
    public static void main(String[] args){
        
        int[] hill={0,0,0,0,0,0,0,0,0,0};
        
        for(int j=0;j<=9;j++){
            hill[j]=new Scanner(System.in).nextInt();
        }
        
        int key;
        int flag;
        
        for(key=9;key>=0;key--){
            
            for(int i=0;i<=key-1;i++){
                if(hill[i]>hill[i+1]){
                    flag=hill[i];hill[i]=hill[i+1];hill[i+1]=flag;
                }
            }
            
        }
        
        System.out.println(hill[9]);
        System.out.println(hill[8]);
        System.out.println(hill[7]);
        
        
        
    }
    
}