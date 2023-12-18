import java.util.Scanner;
 
public class Main{
    public static void main(String[] aaa){
        Scanner s = new Scanner(System.in);
        int[] count = new int[26];
        String st;
        char m,c;
        int i;
        while(s.hasNext()){
            st = s.next();
            for(i=0;i<st.length();i++){
                c=st.charAt(i);
                if('a' <= c && c <= 'z') count[c-'a']++;
                else if('A' <= c && c <= 'Z') count[c-'A']++;
            }
        }
        for(i=0;i<26;i++){
            m = (char)('a'+i);
            System.out.println(m+" : "+count[i]);
        }
    }
}
