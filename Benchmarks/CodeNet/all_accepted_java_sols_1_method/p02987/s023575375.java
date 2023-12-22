import java.util.Scanner;
 
public class Main{
 
    public static void main(String args[]){
 
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
 
        if(s.charAt(0)==s.charAt(1)){
            if(s.charAt(0) != s.charAt(2) && s.charAt(0) != s.charAt(3) && s.charAt(2) == s.charAt(3)){
                System.out.println("Yes");   
            }else{
                System.out.println("No");   
            }
        }else{
            if(s.charAt(0) == s.charAt(2)){
                if(s.charAt(1) == s.charAt(3)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else if(s.charAt(0) == s.charAt(3)){
                if(s.charAt(1) == s.charAt(2)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else{
                System.out.println("No");
            }
        }
    }
}