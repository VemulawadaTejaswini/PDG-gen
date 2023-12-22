import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        
        String ss[] = s.split("");
        String ts[] = t.split("");
        
        int ans = 0;
        for(int i = 0; i < s.length();i++){
            if(!ss[i].equals(ts[i])){
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
