import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        
        String ret = "";
        if((A + B) == (C + D)){
            ret = "Balanced";
        }
        if((A + B) < (C + D)){
            ret = "Right";
        }
        if((A + B) > (C + D)){
            ret = "Left";
        }
        
        System.out.println(ret);
    }
}