import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        // 文字数を取得
        int N = Integer.parseInt(line);
        
        List<List<Character>> list = new ArrayList<>();
        List<Character> chList = null;
        
        while(sc.hasNextLine()) {
            chList = new ArrayList<>();
            char[] ch = sc.nextLine().toCharArray();
            for(int i = 0; i < ch.length; i++) {
                chList.add(ch[i]);
            }
            
            list.add(chList);
        }
        
        //文字数分ループ
        int total = 0;
        char[] moji = new char[list.size()];
        for(int i = 0; i < N; i++) {
            // それぞれの文字をいれていく
            for(int j = 0; j < list.size(); j++) {
                moji[j] = list.get(j).get(i);
            }
            
            // moji のなかで一番多い文字を見つける
            Map<Character, Integer> map = new HashMap<>();
            for(int j = 0; j < moji.length; j++) {
                char c = moji[j];
                
                if(map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            
            int max = 0;
            for(char c : map.keySet()) {
                int tmp = map.get(c);
                
                if(max <= tmp) {
                    max = tmp;
                }
            }
            
            total += list.size() - max;
        }
        
        System.out.println(total);
        
        
    }
    
    
}
