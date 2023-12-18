import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<26;i++){
            map.put((char)('a'+i),0);
        }
        String str,str1;
        while((str = br.readLine())!=null){
            str1 = str.toLowerCase();
            for(int i=0;i<str1.length();i++){
                char c = str1.charAt(i);
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }
            }
        }
        for(HashMap.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}