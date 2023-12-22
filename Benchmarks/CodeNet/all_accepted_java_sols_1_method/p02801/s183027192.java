import java.util.*;
public class Main {
 public static void main(String[] args){
        String Alp[]={"a","b","c","d","e","f","g", "h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        Scanner sc = new Scanner(System.in);
        String n=sc.next();
        for(int i=0;i<Alp.length;i++){
            if(Alp[i].equals(n)){
               System.out.println(Alp[i+1]);
        }
            sc.close();
    }
}
 
}