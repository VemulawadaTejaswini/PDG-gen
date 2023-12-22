import java.util.Scanner;
import java.time.Year;
import java.util.Random;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String s2="";
        int s_length = s.length();
        int t_length = t.length();
        int count = 0;
        int max=0;
        for(int i = 0;i<(s_length-t_length+1);i++){
            s2=s.substring(i, t_length+i);  
            for(int j=0;j<t_length;j++){
                if(s2.charAt(j)==t.charAt(j)){
                    count++;
                    if(max<count){
                        max = count;
                    }
                }
            }count=0;
        }
    System.out.println(t_length-max);    
    }
}