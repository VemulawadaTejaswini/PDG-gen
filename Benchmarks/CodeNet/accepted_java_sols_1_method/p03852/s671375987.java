import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        char s = c.charAt(0);
        String ans = "consonant";
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u') ans = "vowel";
        System.out.println(ans);

    }
}
