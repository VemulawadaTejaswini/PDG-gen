import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static String input;
    public static void main(String[] args) {
        while(read()){

        }

    }

    static boolean read(){
        if(sc.hasNextInt())return false;
        input = sc.next();
        solveFirstGame();
        for(int i = 1; i < 3; i++){
            input = sc.next();
            solveFirstGame();
        }
        return true;
    }

    static void solveFirstGame(){
        int A = 0, B = 0;
        for(int i = 1; i < input.length(); i++){
            if(input.charAt(i) == 'A')A++;
            if(input.charAt(i) == 'B')B++;
        }
        if(A > B){
            A++;
        }else{
            B++;
        }
        System.out.println(A + " " + B);
    }

    static void solve(){
        int A = 0, B = 0;

        System.out.println(A + " " + B);

    }

}