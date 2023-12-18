import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] input;
    public static void main(String[] args) {
        while(read()){
            solve();
        }
    }
    static boolean read(){
        if(!sc.hasNext())return false;
        input = sc.nextLine().split(" ");
        return true;
    }
    static void solve(){
        boolean found = false;
        for(int k = 0; k < 26; k++){
            for(int i = 0; i < input.length; i++){
                char[] word = input[i].toCharArray();
                for(int j = 0; j < word.length; j++){
                    if(Character.isLowerCase(word[j])){
                        word[j] = (char)((word[j] - 'a' + 1)%26 +'a');
                    }
                }
                input[i] = new String(word);
                if(input[i].equals("the") || input[i].equals("this") || input[i].equals("that"))found = true;
            }
            if(found)break;
        }
        for(int i = 0; i < input.length-1; i++){
            System.out.print(input[i] + " ");
        }
        System.out.println(input[input.length-1]);
    }
}