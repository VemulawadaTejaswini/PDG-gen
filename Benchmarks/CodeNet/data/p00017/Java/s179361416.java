import java.util.*;

public class Main{
    Scanner in = new Scanner(System.in);

    String[] T = {"the", "that", "this"};

    void solve(){
        String s;
        while(in.hasNextLine()){
            s = in.nextLine();
            System.out.println(caeser(s));
        }
    }

    String caeser(String str){
        char[] cs = str.toCharArray();
        char[] ds = new char[cs.length];
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < cs.length; j++){
                if('a' <=cs[j] && cs[j] <= 'z'){
                    ds[j] = (char)('a' + (cs[j] - 'a' + i) % 26);
                }else{
                    ds[j] = cs[j];
                }
            }
            str = new String(ds);
            for(String t: T){
                if(str.split(t, -1).length == 2){
                    return str;
                }
            }
        }
        return "";
    }
    
    public static void main(String[] args){
        new Main().solve();    
    }
}