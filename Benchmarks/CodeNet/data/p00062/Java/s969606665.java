import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[]array = new int[10];

    public static void main(String[] args) {
        while(read()){
            solve();
        }
    }
    static boolean read(){
        if(!sc.hasNext())
            return false;
        for(int i = 0; i < 10; i++){
            array[i] = 0;
        }
        String line = sc.next();
        for(int i = 0; i < 10; i++){
            array[i] = line.charAt(i) - '0';
        }
        return true;
    }
    static void solve(){
        for(int k = 0; k < 9; k++){
            for(int i = 0; i < 9; i++){
                array[i] = (array[i] + array[i+1])%10;
            }
        }
        System.out.println(array[0]);
    }

}