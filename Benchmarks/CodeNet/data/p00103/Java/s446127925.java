import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n, base, out, score;
    static String input;
    public static void main(String[] args) {
        while(read()){

        }
    }

    static boolean read(){
        if(!sc.hasNext())return false;
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            solve();
        }
        return true;
    }

    static void solve(){
        while(out != 3){
            input = sc.next();
            if(input.equals("HIT")){
                base++;
                if(base == 4){
                    score++;
                    base--;
                }
            }else if(input.equals("OUT")){
                out++;
            }else if(input.equals("HOMERUN")){
                score += base + 1;
                base = 0;
            }
        }
        System.out.println(score);
        score = 0;
        base = 0;
        out = 0;
    }

}