
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
  		String  str = sc.next();
        String ans = "";
        int a = Character.getNumericValue(str.charAt(0));
        int b = Character.getNumericValue(str.charAt(1));
        int c = Character.getNumericValue(str.charAt(2));
        int d = Character.getNumericValue(str.charAt(3));
        
        if(a+b+c+d==7){
            ans = ""+a+"+"+b+"+"+c+"+"+d+"=7";
        }else if(a+b+c-d==7){
            ans = ""+a+"+"+b+"+"+c+"-"+d+"=7";
        }else if(a+b-c+d==7){
            ans = ""+a+"+"+b+"-"+c+"+"+d+"=7";
        }else if(a+b-c-d==7){
            ans = ""+a+"+"+b+"-"+c+"-"+d+"=7";
        }else if(a-b+c+d==7){
            ans = ""+a+"-"+b+"+"+c+"+"+d+"=7";
        }else if(a-b+c-d==7){
            ans = ""+a+"-"+b+"+"+c+"-"+d+"=7";
        }else if(a-b-c+d==7){
            ans = ""+a+"-"+b+"-"+c+"+"+d+"=7";
        }else if(a-b-c-d==7){
            ans = ""+a+"-"+b+"-"+c+"-"+d+"=7";
        }
        
        
		System.out.println(ans);
   }
}
