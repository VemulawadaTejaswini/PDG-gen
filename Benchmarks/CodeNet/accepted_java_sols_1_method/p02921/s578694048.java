import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int cnt =0;

        for(int i = 0; i < 3; i++) {
        	if(String.valueOf(s.charAt(i)).equals(String.valueOf(t.charAt(i)))){
        		cnt++;
        	}
        }
        System.out.println(cnt);
        
        sc.close();
    }
}
