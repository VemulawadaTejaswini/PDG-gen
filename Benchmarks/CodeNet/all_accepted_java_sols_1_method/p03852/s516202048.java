import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        char d = c.charAt(0);
        if(d=='a'||d=='i'||d=='u'||d=='e'||d=='o'){
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }
    }
}
