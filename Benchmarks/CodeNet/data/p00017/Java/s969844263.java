import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                        String[] s  = sc.nextLine().split(" ");
                        int n = -1; 
                        for(int i = 0; n == -1; i++){
                                String tmp = s[i];
                                n = Math.max(Math.max(matches(tmp, "that"), matches(tmp, "this")),matches(tmp, "the"));
                        }   
                        for(int i = 0; i < s.length; i++){
                                System.out.print(shift(s[i], -n));
                                if(i < s.length-1){
                                        System.out.print(" ");
                                }   
                        }   
                        System.out.println();
                }   
                sc.close();
        }   
        static int matches(String s, String pattern){
                if(s.charAt(s.length()-1) == '.'){
                        s = s.substring(0, s.length()-1);
                }   
                if(s.length() != pattern.length()){
                        return -1; 
                }   
                int[] p = new int[pattern.length()];
                int[] q = new int[s.length()];
                for(int i = 1; i < p.length; i++){
                        p[i] = pattern.charAt(i)-pattern.charAt(i-1);
                        q[i] = s.charAt(i)-s.charAt(i-1);
                }   
                int n = -1; 
                if(Arrays.equals(p,q)){
                        n = s.charAt(0) - pattern.charAt(0);
                        if(n < 0){ 
                                n += 26; 
                        }   
                }   
                return n;
        }   
        static String shift(String s, int n){
                String tmp = ""; 
                for(int i = 0; i < s.length(); i++){
                        tmp += shift(s.charAt(i), n); 
                }   
                return tmp;
        }   
        static char shift(char c, int n){
                if(c != '.'){
                        c += n;
                        if(c < 'a'){
                                 c += 26; 
                        }   
                }   
                return c;
        }   
}