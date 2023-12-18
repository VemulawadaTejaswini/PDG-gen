import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] alps = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] s = sc.next().toCharArray();
        for(char c : alps){
            boolean bool = false;
            for(int i = 0; i < s.length; i++){
                if(s[i] == c){
                    bool = true;
                    break;
                }
            }
            if(!bool){
                System.out.println(new String(s) + c);
                return;
            }
        }
        ArrayList<Character> cl = new ArrayList<Character>();
        for(int i = 25; i > 0; i--){
            cl.add(s[i]);
            if(s[i] - s[i-1] > 0){
                Collections.sort(cl);
                for(char c : cl){
                    if(s[i-1] - c < 0){
                        s[i-1] = c;
                        String ans = new String(Arrays.copyOfRange(s,0,i));
                        System.out.println(ans);
                        return;
                    } 
                }
            }
        }
        System.out.println(-1);
    }
}