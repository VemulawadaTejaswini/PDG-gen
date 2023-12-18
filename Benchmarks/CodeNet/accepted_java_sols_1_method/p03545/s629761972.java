import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);

        String S =sc.next();
        String [] List = S.split("");
        int i=0;
        int[] ans =new int[4];
        int answer=0;
        int tmp =0;
        for(i=0;i<List.length;i++){
            
            ans[i]=Integer.parseInt(List[i]);
            
        }
        
        if(ans[0]+ans[1]+ans[2]+ans[3]==7){
            answer=ans[0]+ans[1]+ans[2]+ans[3];
            System.out.println(ans[0]+"+"+ans[1]+"+"+ans[2]+"+"+ans[3]+"="+answer);
            return;
            
        }else if(ans[0]-ans[1]+ans[2]+ans[3]==7){
            
            answer=ans[0]-ans[1]+ans[2]+ans[3];
            System.out.println(ans[0]+"-"+ans[1]+"+"+ans[2]+"+"+ans[3]+"="+answer);
            return;
            
        }else if(ans[0]+ans[1]-ans[2]+ans[3]==7){
            
            answer=ans[0]+ans[1]-ans[2]+ans[3];
            System.out.println(ans[0]+"+"+ans[1]+"-"+ans[2]+"+"+ans[3]+"="+answer);
            return;
            
        }else if(ans[0]+ans[1]+ans[2]-ans[3]==7){
            
            answer=ans[0]+ans[1]+ans[2]-ans[3];
            System.out.println(ans[0]+"+"+ans[1]+"+"+ans[2]+"-"+ans[3]+"="+answer);
            return;
            
        }else if(ans[0]-ans[1]-ans[2]+ans[3]==7){
            
            answer=ans[0]-ans[1]-ans[2]+ans[3];
            System.out.println(ans[0]+"-"+ans[1]+"-"+ans[2]+"+"+ans[3]+"="+answer);
            return;
            
        }else if(ans[0]-ans[1]+ans[2]-ans[3]==7){
            
            answer=ans[0]-ans[1]+ans[2]-ans[3];
            System.out.println(ans[0]+"-"+ans[1]+"+"+ans[2]+"-"+ans[3]+"="+answer);
            return;
            
        }else if(ans[0]+ans[1]-ans[2]-ans[3]==7){
            
            answer=ans[0]+ans[1]-ans[2]-ans[3];
            System.out.println(ans[0]+"+"+ans[1]+"-"+ans[2]+"-"+ans[3]+"="+answer);
            return;
            
        }else if(ans[0]-ans[1]-ans[2]-ans[3]==7){
            
            answer=ans[0]-ans[1]-ans[2]-ans[3];
            System.out.println(ans[0]+"-"+ans[1]+"-"+ans[2]+"-"+ans[3]+"="+answer);
            return;
            
        }
        
    }
    
} 
