import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.ArrayDeque;
import java.io.*;
public class Main{
	public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] v= {-4, -1, 1, 4};
        Map<String, Integer> mini = new HashMap<String, Integer>();
        mini.put("01234567",0);
        
        Queue<String> que= new ArrayDeque<>();
        que.add("01234567");
        while(!que.isEmpty()){
            String s = que.element();
            que.remove();
            int n = 0;
            for(int i = 0; i < 8; i++){
                if(s.charAt(i) == '0'){
                    n = i;
                    break;
                }
            }
            
            for (int i = 0; i < 4; i++) {
                int m = n + v[i];
                if(m < 0||7 < m) continue;
                if(n == 3 & m == 4)continue;
                if(n == 4 & m == 3)continue;
                char c = s.charAt(m);
                String sub_1 = s.replace('0', 'A');
                String sub_2 = sub_1.replace(c, '0');
                String news = sub_2.replace('A',c);
                if(!mini.containsKey(news)){
                    mini.put(news, mini.get(s) + 1);
                    que.add(news);
                }
            }
        }

        try {String str;
            while((str = reader.readLine()) != null){
                char[] ch = new char[8];
                for(int i = 0; i < 8; i++){
                    char sub = str.charAt(i*2);
                    ch[i] = sub;
                }
                String index = new String(ch);
                System.out.println(mini.get(index));
            }
        }catch (IOException e){
            System.out.println(e);
        }  
    }
}
