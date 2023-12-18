import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String words;
        words = scan.next();
        int result;
        
        while(!words.equals("0")){
            result=0;
            for(int i=0; i<words.length(); i++){
                result+=(int)(words.charAt(i)-'0');
            }
            
            System.out.println(result);
            words = scan.next();
        }
    }
}
