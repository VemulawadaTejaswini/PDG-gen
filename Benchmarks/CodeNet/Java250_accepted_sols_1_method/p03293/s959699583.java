import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        
        char words[] = new char[s1.length()];
        for(int i = 0; i < s1.length(); i++){
            words[i] = s1.charAt(i);
        }
        
        boolean match = false;
        for(int i = 0; i < s1.length(); i++){
            if(s2.equals(String.valueOf(words))){
                match = true;
                break;
            }else{
                char tmp = words[s1.length() - 1];
                for(int j = s1.length() - 1; j > 0; j--){
                    words[j] = words[j - 1];
                }
                words[0] = tmp;
            }
        }
        
        if(match){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
