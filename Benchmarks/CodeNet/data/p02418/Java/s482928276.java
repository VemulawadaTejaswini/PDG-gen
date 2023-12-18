import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String p=sc.next();
        String s=sc.next();
        String t;
        boolean flag=false;
        int i;
        for(i=0;i<s.length();i++){
            t=s.substring(i,s.length());
            if(p.startsWith(t)){
                flag=true;
                break;
            }
        }
        if(flag){
            flag=false;
            t=s.substring(0,i);
            if(i==0) flag=true;
            else if(p.endsWith(t)) flag=true;
        }
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
