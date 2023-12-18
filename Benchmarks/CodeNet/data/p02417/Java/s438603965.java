import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = str1.toLowerCase();
        char[] str = str2.toCharArray();
        int[] count = new int[26];

        for(char c='a';c<='z';c++){
            for(int i=0;i<str.length;i++){
                if(str[i] == c){count[c-'a']++;}
            }
            System.out.println(c + " : " + count[c-'a']);
        }
    }
}
