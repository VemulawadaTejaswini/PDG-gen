import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            String str = sc.next();

            if(str.length() % 2 == 0){
                while(str.length() >= 2){
                    str = str.substring(0, str.length() - 2);
                    String str1 = str.substring(0, str.length()/2);
                    String str2 = str.substring(str.length()/2);
                    if(str1.equals(str2)){
                        System.out.println(str.length());
                        break;
                    }
                }
            } else{
                str = str.substring(0, str.length() - 2);
                String str1 = str.substring(0, str.length()/2);
                String str2 = str.substring(str.length()/2);
                if(str1.equals(str2)){
                    System.out.println(str.length());
                }else{
                    while(str.length() >= 2){
                        str = str.substring(0, str.length() - 2);
                        str1 = str.substring(0, str.length()/2);
                        str2 = str.substring(str.length()/2);
                        if(str1.equals(str2)){
                            System.out.println(str.length());
                            break;
                        }
                    }
                }
            }

 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}