import java.util.Scanner;

public class Main{
    public static void solve(){
        String t = null, w = null;
        int c = 0;
        Scanner scan = new Scanner(System.in);
        w = scan.next();
        while(true){
            t = scan.next();
            if(t.equals("END_OF_TEXT"))break;
            else if(t.equalsIgnoreCase(w)){
                c++;
            }
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        solve();
    }
    
}

