
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int x = in.nextInt();
        
        int y = in.nextInt();
        
        int z = in.nextInt();
        
        int k = in.nextInt();
        
        int x1=x;
        
        int y1=y;
        
        
        int res[]=new int[3];
        
        for(int i=0;i<3;i++){
            
            for(int j=0;j<k;j++){
                
                if(i==0){
                   
                    x=x*2;
                    res[0]=x+y+z;
                   
                }
                
                if(i==1){
                    
                    x=x1;
                    y=y*2;
                    res[1]=x+y+z; 
                }
                
                if(i==2){
                   
                    y=y1;
                    z =z*2;
                    res[2]=x+y+z; 
                    
                }
            }
            
        }
        
        Arrays.sort(res);
        
        System.out.println(res[res.length-1]);
       
       
    }
    
}
