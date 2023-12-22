import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ss =s.substring(0,s.length()-1);
        int len = ss.length();
        
        for(int i =0;i<len;i++){
            if(ss.length()%2==0){
                String s1=ss.substring(0,(ss.length()/2));
                String s2=ss.substring(ss.length()/2,ss.length());
                if(s1.equals(s2)){
                    System.out.println(ss.length());
                    break;
                }
            }
            ss = ss.substring(0,ss.length()-1);
        }
    }
}




