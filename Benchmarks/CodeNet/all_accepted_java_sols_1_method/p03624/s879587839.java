import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String ans = "";
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Alphabet[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int min = 25;
        
        for (int i = 0; i < Alphabet.length; i++){
            int result = str.indexOf(Alphabet[i]);
            
            if(result == -1){
                if (min >= i){
                    min = i;
                    ans = Alphabet[min];
                }
            }
        }

        if ("".equals(ans))
            System.out.println("None");
        else
            System.out.println(ans);
        
        sc.close();
    }
}