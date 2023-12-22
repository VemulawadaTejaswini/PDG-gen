import java.io.*;
import java.util.HashMap;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        HashMap<String,Integer> map = new HashMap<>();
        for (int i=0;i<N;i++){
            str = br.readLine();
            if (map.containsKey(str)){
                map.put(str,map.get(str)+1);
            } else {
                map.put(str,1);
            }
        }
        int ans = 0;
        for (String s:map.keySet()){
            if (map.get(s)%2!=0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}