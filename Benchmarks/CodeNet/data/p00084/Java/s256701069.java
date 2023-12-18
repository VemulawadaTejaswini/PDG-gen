import java.util.*;
import java.util.stream.Collectors;

public class Main{
    Scanner in = new Scanner(System.in);

    void solve(){
        List<String> list = Arrays.asList(in.nextLine().replaceAll(",|\\."," ").split("[ ]+"));
        list = list.stream()
            .filter(s -> 2 < s.length() && s.length() < 7)
            .collect(Collectors.toList());
        System.out.println(String.join(" ", list));
    }
    
    public static void main(String[] args){
        new Main().solve();    
    }
}