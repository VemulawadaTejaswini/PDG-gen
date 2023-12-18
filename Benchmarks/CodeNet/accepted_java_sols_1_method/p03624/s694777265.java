import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] chars={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String s=sc.next();
        for(int i=0;i<26;i++){
            if(s.length()-s.replaceAll(chars[i],"").length()==0){
                System.out.println(chars[i]);
                return;
            }
        }
        System.out.println("None");
    }
 
    
}