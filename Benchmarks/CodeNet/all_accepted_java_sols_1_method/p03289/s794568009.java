import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        String[] SS = S.split("");
        
        int count = 0;
        int iw = 0;
        
        int count1 = 0;
        
            
        if(SS[0].equals("A")){
            
            for(int i=2; i<S.length()-1; i++){
                if(SS[i].equals("C")){
                   count++; 
                   iw = i;
                }
            }
            
        }
        
        
        for(int i=0; i<S.length(); i++){
            if(count == 1){
               if(Character.isUpperCase(S.charAt( i ))){
                   count1++;
               }
            }
        }
        
        if(count1 == 2){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }
        
    }
        
}
