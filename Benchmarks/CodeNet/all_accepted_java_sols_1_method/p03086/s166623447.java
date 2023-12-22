import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String spt[] =str.split("");
        int count=0;
        int answer =0;
        
        for(int i=0;i<spt.length;i++){
            if(spt[i].equals("A")||spt[i].equals("T")||spt[i].equals("C")||spt[i].equals("G")){
                count+=1;
                if(answer<count){
                
                    answer=count;
                }
            }else{
                count =0;
            }
            
        }
        if(answer<count){
            answer=count;
        }
        System.out.println(answer);
    }
}
