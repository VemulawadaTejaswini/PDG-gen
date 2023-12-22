import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String p=sc.next();
        String s=sc.next();
        String t;
        boolean loopflag=false;
        boolean flag=false;
        int i;
        for(i=0;i<p.length()-s.length();i++){
            if(p.substring(i,i+s.length()).equals(s)) flag=true;
        }
        for(i=0;i<s.length();i++){
            t=s.substring(i,s.length());
            if(p.startsWith(t)){
                loopflag=true;
                break;
            }
        }
        if(loopflag){
            loopflag=false;
            t=s.substring(0,i);
            if(i==0) loopflag=true;
            else if(p.endsWith(t)) loopflag=true;
        }
        if(flag || loopflag) System.out.println("Yes");
        else System.out.println("No");
    }
}

