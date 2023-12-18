import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int n = Integer.parseInt(sc.next());
        String S = sc.next();
        String[] s = S.split("");
        int i=0;
        int j=n-1;
        int count = 0;
        while(i<j) {
            while(i<n) {
                if(s[i].equals("W")) {
                    break;
                }
                i++;
            }
            
            while(0<j) {
                if(s[j].equals("R")) {
                    break;
                }
                j--;
            }
            
            if(i<j) {
                String swap = s[i];
                s[i] = s[j];
                s[j] = swap;
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
        
    }
}
