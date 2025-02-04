import java.util.*;
public class Main {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String w = sc.nextLine();
            
            boolean[] alphabets = new boolean[26];
            for(int i = 0;i<26;i++){
                alphabets[i] = true;
            }
            
            for(int i = 0;i<w.length();i++){
                alphabets[(int)w.charAt(i) - 97] = !alphabets[(int)w.charAt(i) - 97];
            }
            
            for(boolean evenChar : alphabets){
                if(!evenChar){
                    System.out.println("No");
                    System.exit(0);
                }
            }
            System.out.println("Yes");
            
    }
}