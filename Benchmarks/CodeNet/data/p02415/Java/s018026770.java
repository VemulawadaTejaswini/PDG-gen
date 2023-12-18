import java.util.Scanner;

public class Main{
    public static void main (String[]args){
        try(Scanner sc = new Scanner(System.in)){
            String l=sc.nextLine();
            int length=l.length();
            String ans="";
            for(int a=0;a<length;a++){
                char c=l.charAt(a);
               
                if(Character.isLowerCase(c)){
                    ans+=Character.toUpperCase(c);
                }
                else ans+=Character.toLowerCase(c);
            }       
            System.out.println(ans);         
        }  
    }
}
