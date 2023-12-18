import java.util.*;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int x=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+'){
                x+=1;
            }
            else{
                x-=1;
            }
        }
        System.out.println(x);
    }
}