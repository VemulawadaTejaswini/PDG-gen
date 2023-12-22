import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        int[] c = new int[26];
        int i;
        for(i=0;i<26;i++){
            c[i]=0;
        }
        for(i=0;i<w.length();i++)
            c[(int)w.charAt(i)-97]++;
        for(i=0;i<26;i++){
            if(c[i]%2!=0){
                System.out.println("No");
                break;
            }
        }
        if(i==26) System.out.println("Yes");
    }
}
