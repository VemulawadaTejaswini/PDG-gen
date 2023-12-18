import java.util.*;
class Main{
    
    public static void main(String args[]) {
Scanner scan  = new Scanner(System.in);
int X = scan.nextInt();
int K = scan.nextInt();
int D = scan.nextInt();
        System.out.println(process(X,K,D));    
    }   
    
    
    public static int process(int start,int count,int leap){
        if(count==0)
        return Math.abs(start);
        return Math.min(process(start+leap,count-1,leap),process(start-leap,count-1,leap));
        
    }
    
    
}
