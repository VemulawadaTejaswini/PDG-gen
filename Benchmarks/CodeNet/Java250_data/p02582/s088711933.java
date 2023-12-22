import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        int max=Integer.MIN_VALUE;
        if(s.charAt(0)=='R' && s.charAt(1)=='R' && s.charAt(2)=='R')
        count=3;
        else if(s.charAt(0)=='R' && s.charAt(1)=='R')
        count=2;
        else if(s.charAt(1)=='R' && s.charAt(2)=='R')
        count=2;
        else if(s.charAt(0)!='R' && s.charAt(1)!='R' && s.charAt(2)!='R')
        count=0;
        else
        count=1;
        System.out.println(count);
    }    
}