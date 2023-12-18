import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ans = new ArrayList<String>();
        boolean[] map = new boolean[999999];
        for(int i = 0;i < 999999;i++) map[i] = true;
        for(int i = 0;i < 999999;i++){
            if(map[i]){
                for(int j = 2;(i + 1) * j < 999999;j++){
                    if(map[i * j]) map[i * j] = false;
                }
            }
        }
        while(sc.hasNext()){
            int cnt = 0;
            for(int i = 0;i < sc.nextInt();i++){
                if(map[i]) cnt++;
            }
            ans.add(cnt);
        }
        for(int i = 0,size = ans.size();i < size;i++) System.out.println(ans.get(i));
    }
}