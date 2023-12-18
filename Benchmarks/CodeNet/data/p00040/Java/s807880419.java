import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
 
        while(n-- > 0){
            char[] s = sc.nextLine().toCharArray();
            for(int i=0;i<s.length;i++) s[i] -= 'a';
 
            String aft = "";
 
            for(int a=1;aft.equals("");a++){
                if(gcd(a,26) != 1) continue;
                for(int b=0;b<26;b++){
                    for(int i=0;i<s.length;i++){
                        if(0<=s[i] && s[i]<26){
                            aft += (char)((a * s[i] + b) % 26 + 'a');
                        }
                        else{
                            aft += (char)(s[i] + 'a');
                        }
                    }
 
                    if(aft.contains("that") || aft.contains("this")) break;
                    aft = "";
                }
            }
 
            System.out.println(aft);
        }
    }
 
    private static int gcd(int a,int b){
        return b==0 ? a : gcd(b,a%b);
    }
}
