import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int k=scn.nextInt();
        String s=scn.next();
        if(s.length()>k){
            System.out.println(s.substring(0,k)+"...");
        }else{
            System.out.println(s);
        }
    }
}
