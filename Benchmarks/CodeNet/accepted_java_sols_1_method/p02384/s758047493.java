import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] d = new int[7];
        int dice=1, i=0, ans=0, q=0, surface=0, bottom=0, right=0;
        
        for(i=0;i<6;i++)d[i+1] = sc.nextInt();
        
        q = sc.nextInt();
        
        for(i=0;i<q;i++){
            surface = sc.nextInt();
            bottom = sc.nextInt();
            if(surface == d[1]){
                if(bottom == d[2])right = d[3];
                else if(bottom == d[3])right = d[5];
                else if(bottom == d[4])right = d[2];
                else right = d[4];
            
            }else if(surface == d[2]){
                if(bottom == d[1])right = d[4];
                else if(bottom == d[3])right = d[1];
                else if(bottom == d[4])right = d[6];
                else right = d[3];
               
            }else if(surface == d[3]){
                if(bottom == d[1])right = d[2];
                else if(bottom == d[2])right = d[6];
                else if(bottom == d[5])right = d[1];
                else right = d[5];
                
            }else if(surface == d[4]){
                if(bottom == d[1])right = d[5];
                else if(bottom == d[2])right = d[1];
                else if(bottom == d[5])right = d[6];
                else right = d[2];
                
            }else if(surface == d[5]){
                if(bottom == d[1])right = d[3];
                else if(bottom == d[3])right = d[6];
                else if(bottom == d[4])right = d[1];
                else right = d[4];
                
            }else if(surface == d[6]){
                if(bottom == d[2])right = d[4];
                else if(bottom == d[3])right = d[2];
                else if(bottom == d[4])right = d[5];
                else right = d[3];
                
            }
            System.out.println(right);
        }
    }
}
