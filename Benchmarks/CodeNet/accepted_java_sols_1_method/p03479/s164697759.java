import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long X = Long.parseLong(sc.next());
        long Y = Long.parseLong(sc.next());
        
        long count = 1;
        while(true){
            X *=2;
            
            if(Y > X){
                count++;
            }else if(Y == X){
                count++;
                break;
            }else{
                break;
            }
        }
        
        System.out.println(count);
    }
}