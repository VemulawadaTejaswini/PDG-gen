import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    static final Scanner sc = new Scanner(System.in);
    public static void main(final String[] args){
        final Pattern p = Pattern.compile("R+");
        final Matcher m = p.matcher(sc.next());
        if (m.find()){
            System.out.println(m.group().length());
        }else{
            System.out.println(0);
        }
    }
}
