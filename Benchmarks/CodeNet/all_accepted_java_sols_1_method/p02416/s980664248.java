import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int i,j;
        
        Scanner sc=new Scanner(System.in);
        
        String str;
        Character c;
        int sum;
        
        while(true){
            str=sc.next();
            if(str.equals("0"))break;
            
            sum=0;
            for(i=0;i<str.length();i++){
                c=str.charAt(i);
                sum+=c-'0';
            }
            
            System.out.println(sum);
        }
    }
}

