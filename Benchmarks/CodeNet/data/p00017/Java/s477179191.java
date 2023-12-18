import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] s;
    public static void main(String[] args) {
        while(hantei()){
            bun();
        }
    }
    static boolean hantei(){
        if(sc.hasNext()){
            s = sc.nextLine().split(" ");    
            return true;
        }
        return false;
    }
    
    static void bun(){
        boolean f = false;
        for(int k = 0; k < 26; k++){
            for(int i = 0; i < s.length; i++){
                char[] tango = s[i].toCharArray();
                for(int j = 0; j < tango.length; j++){
                    if (tango[j] != '.') {
                        tango[j] = (char)((tango[j] - 'a' + 1)%26 +'a');
                        }
                }
                s[i] = new String(tango);
                if(s[i].equals("the") || s[i].equals("this") || s[i].equals("that")){
                    f = true;
                }
            }
            if(f){
                break;
            }
        }
        for(int i = 0; i < s.length-1; i++){
            System.out.print(s[i] + " ");
        }
        System.out.println(s[s.length-1]);
    }
}