import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String text = sc.nextLine();
        
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
                System.out.print(c);
            }else{
                c = Character.toUpperCase(c);
                System.out.print(c);
            }
        }
        System.out.println("");
    }
}
