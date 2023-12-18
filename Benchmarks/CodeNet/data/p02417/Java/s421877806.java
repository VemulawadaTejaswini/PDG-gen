import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < 26; i++) {
            char ch = alpha.charAt(i);
            String st = String.valueOf(ch);
            hash.put(st, 0);
        }
        
        while(true) {
            String line;
            try {
                line = sc.nextLine();
            }catch(NoSuchElementException e) {
                break;
            }
            String[] st = line.split("");
            for(int i = 0; i < st.length; i++) {
                String str = st[i].toLowerCase();
                if(hash.containsKey(str)) {
                    hash.put(str, hash.get(str) + 1);
                }
                
            }
        }
        for(String str : hash.keySet()) {
            System.out.println(str + " : " + hash.get(str));
        }

    }
 }
