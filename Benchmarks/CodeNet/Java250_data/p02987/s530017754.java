import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        String s = sc.nextLine();
        boolean res = true;
        int i = 0;
        if(s.charAt(0)==s.charAt(1) && s.charAt(2)==s.charAt(0) && s.charAt(2)==s.charAt(3)){
            res = false;
        }
        else{
        if(s.charAt(i)==s.charAt(i+1)||s.charAt(i)==s.charAt(i+2)||s.charAt(i)==s.charAt(i+3)){
            if(s.charAt(i+1)==s.charAt(i+2)||s.charAt(i+1)==s.charAt(i+3)){
                
            }
            else{
                if(s.charAt(i+2)==s.charAt(i+3)){

                }
                else    
                    res = false;
            }

                
                
        }
        else{
            res = false;
        }
    }
           
        if(res == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}