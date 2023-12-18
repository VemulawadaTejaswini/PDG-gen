import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        
        boolean flag = false;
        for(int i=0; i<N; i++){
            String s = sc.next();
            
            if(s.equals("Y")){
                flag = true;
                break;
            }
        }
        
        if(flag){
            System.out.println("Four");
        }else{
            System.out.println("Three");
        }
    }
}