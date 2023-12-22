import java.util.Scanner;

public class Main{
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.next();
            if(s.equals("0")){
                break;
            }

            int a = 0;
            for(int i=0;i<s.length();i++){
                a += s.charAt(i) - '0';
            }
            System.out.println(a);
   
        }
    
    }   
}
