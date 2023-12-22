import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Main {
	public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
 
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] mojiList = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        for(char key : mojiList) {
           map.put(key, 0);
        }
        
        String input;
        
        while((input = br.readLine()) != null) {
            char[] strList = input.toLowerCase().toCharArray();
            for(char moji : strList) {
                if(map.containsKey(moji)) {
                    map.put(moji, map.get(moji) + 1);
                }
            }
        }
 
        for(char moji : mojiList) {
            System.out.println(moji + " : " + map.get(moji));
        }
    }
}