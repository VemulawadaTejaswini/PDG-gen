import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] input;
    public static void main(String[] args) {
        while(read()){
            solve();
        }

    }

    static boolean read(){
        input = sc.nextLine().split(" ");
        if(input.length >=3){
            if(input[0].equals("END") &&
                    input[1].equals("OF") &&
                    input[2].equals("INPUT"))return false;
        }
        return true;
    }

    static void solve(){
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i].length());
        }
        System.out.println();
    }

}