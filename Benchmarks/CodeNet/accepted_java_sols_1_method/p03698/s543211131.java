import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] c=new int[140];
        for(int i=0;i<s.length();i++){
            c[(int)s.charAt(i)]++;
        }
        boolean ans=true;
        for(int i=0;i<c.length;i++){
            if(c[i]>=2){
                ans=false;
                break;
            }
        }
        if(ans)System.out.println("yes");
        else System.out.println("no");
        

    }
}