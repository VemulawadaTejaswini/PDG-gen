import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        
        int ans = 0;
        for(int i=A; i<=B; i++){
            String[] s = Integer.toString(i).split("");
            if(s[0].equals(s[1]) && s[0].equals(s[3]) && s[0].equals(s[4]) &&
               s[1].equals(s[3]) && s[1].equals(s[4]) &&
               s[3].equals(s[4])){
                ans++;
            }else if(s[0].equals(s[4]) && s[1].equals(s[3])){
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}