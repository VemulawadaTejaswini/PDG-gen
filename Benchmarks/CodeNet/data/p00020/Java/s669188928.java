import java.util.*;

public class Main{
    Scanner in = new Scanner(System.in);

    void solve(){
        String s = in.nextLine();
        for(char ch : s.toCharArray()){
            System.out.print(Character.toUpperCase(ch));
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        new Main().solve();    
    }
}