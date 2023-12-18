import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        while(read()){
            System.out.println(solve(n));
        }

    }
    static boolean read(){
        if(!sc.hasNext())return false;
        n = sc.nextInt();
        return true;
    }

    static long solve(int in){
        if(in == 1)return 1;
        return solve(in - 1)*in;
    }
}