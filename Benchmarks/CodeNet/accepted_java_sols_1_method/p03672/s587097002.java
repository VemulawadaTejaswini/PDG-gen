import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        s = s.substring(0, s.length()-1);
        while(true){
            String first = s.substring(0, s.length()/2);
            String last = s.substring(s.length()/2);
            if(first.equals(last)){
                System.out.println(s.length());
                return;
            }else{
                s = s.substring(0, s.length()-1);
            }
        }
    }
}