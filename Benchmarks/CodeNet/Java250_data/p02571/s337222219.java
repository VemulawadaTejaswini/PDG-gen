import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m_x = 0;
        String s = sc.next();
        String t = sc.next();
        
        for(int i=0;i<s.length()-t.length()+1;i++){
            String sub = s.substring(i,i+t.length());
            int c = monmo(sub,t);
            if(m_x < c)m_x = c;
        }
        
        System.out.println(t.length()-m_x);
    }
    
    static int monmo(String sub,String t){
        int count=0;
        //String subArray[] = sub.split("");
        //String tArray[] = t.split("");
        for(int i=0;i<t.length();i++){
            char subA = sub.charAt(i);
            char tA = t.charAt(i);
            //if(subArray[i].equals(tArray[i]))count++;
            if(subA == tA)count++;
        }
        
        return count;
    }
}
