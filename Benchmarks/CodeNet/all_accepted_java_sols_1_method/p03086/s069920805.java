import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //int n = Integer.parseInt(sc.next());
        String s = sc.next();
        boolean[] isDNA = new boolean[s.length()];
        char c = '\0';
        for(int i = 0;i<s.length();i++){
            c = s.charAt(i);
            if((c == 'A')||(c == 'C')||(c == 'G')||(c == 'T')) isDNA[i] = true;
        }
        int j =0, max=0;
        for(int i = 0;i<isDNA.length;i++){
            j=i;
            while((j<isDNA.length)&&isDNA[j]) j++;
            max = (j-i)>max ? j-i : max;
        }
        
        System.out.println(max);
    }
}