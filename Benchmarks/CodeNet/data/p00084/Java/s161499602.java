import java.util.*;
import java.util.stream.Collectors;

public class Main{
    Scanner in = new Scanner(System.in);

    void solve(){
        List<String> list = Arrays.asList(in.nextLine().replaceAll(",|\\."," ").split("[ ]+"));
        System.out.println(String.join(" ", list.stream().filter(s -> 2 < s.length() && s.length() < 7).collect(Collectors.toList())));
    }
    
    public static void main(String[] args){
        new Main().solve();    
    }
}