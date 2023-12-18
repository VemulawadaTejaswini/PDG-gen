import java.util.regex.Pattern;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        Scanner T = new Scanner(System.in);
		Pattern p = Pattern.compile(S + "[a-z]$");
		return p.matcher(T).find() ? "Yes" : "No";
    }
}