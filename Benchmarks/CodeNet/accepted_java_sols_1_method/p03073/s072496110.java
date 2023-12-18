import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(i%2==1){
                if(s.charAt(i)=='0') count++;
            }else 
            if(s.charAt(i)=='1') count++;
        }
        if(s.length()-count<count){
            System.out.println(s.length()-count);
        }else System.out.println(count);
        
        
    }
}