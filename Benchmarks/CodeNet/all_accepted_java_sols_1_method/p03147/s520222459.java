import java.util.*;
public class Main {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        
            
        }
        int output=0;
        flag2:while(true){
            for(int i=0;i<n;i++){
                if(nums[i]>0){
                    output++;
                    for(int j=0;j<n-i;j++){
                        if(nums[i+j]==0){
                            
                            continue flag2;
                        }
                        nums[i+j]-=1;
                        }
                    continue flag2;
                        
                        
                    }
                
            }
            break flag2;
            
            }
        System.out.println(output);
        }
    
            
            
        
        
        

    }