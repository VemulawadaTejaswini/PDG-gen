import java.util.*;

public class Volume000001{
    
    static int[] height={1245,7756,5657,676,4546,567,23435,465656,4546,2130};
    
    public static void main(String[] args){
        
        int[] hill={1245,7756,5657,676,4546,567,23435,465656,4546,2130};
        
        for(int i=0;i<=9;i++){
            hill[i]=new Scanner(System.in).nextInt();
        }
        
        //sort
        int key;
        int obj;
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