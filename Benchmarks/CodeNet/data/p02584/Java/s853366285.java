import java.util.*;
class Main{
    
    public static void main(String args[]) {
        System.out.println(process(7,4,3));    
    }   
    
    
    public static int process(int start,int count,int leap){
        if(count==0)
        return Math.abs(start);
        return Math.min(process(start+leap,count-1,leap),process(start-leap,count-1,leap));
        
    }
    
    
}
