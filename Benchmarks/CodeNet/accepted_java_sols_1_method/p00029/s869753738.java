import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" ");
        int n = words.length;
        
        HashMap<String, Integer> dic = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++) {
            String word = words[i];
            if(dic.containsKey(word)) {
                dic.put(word, dic.get(word)+1);
            }else {
                dic.put(word, 1);
            }
        }
        
        String maxtimesword = "";
        int maxtimes = 0;
        String maxlengthword = "";
        int maxlength = 0;
        
        for(String key : dic.keySet()) {
            if(dic.get(key) > maxtimes) {
                maxtimes = dic.get(key);
                maxtimesword = key;
            }
            if(key.length() > maxlength) {
                maxlength = key.length();
                maxlengthword = key;
            }
        }
        System.out.println(maxtimesword+" "+maxlengthword);
    }    
}

