import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        int acount=0;
        int bcount=0;
        int count=0;
        int both=0;
        for(int i=0;i<n;i++){
            if(s[i].charAt(0)=='B') bcount++;
            if(s[i].charAt(s[i].length()-1)=='A') acount++;
            if(s[i].charAt(0)=='B' &&s[i].charAt(s[i].length()-1)=='A') both++;
            for(int k=0;k<s[i].length()-1;k++){
                if(s[i].charAt(k)=='A' && s[i].charAt(k+1)=='B') count++;
            }
        }
        int min=Math.min(acount,bcount);
        if(both==0 ||acount+bcount-both*2>0) System.out.println(count+min);
        else  System.out.println(both+count-1);
        
        
    }
}