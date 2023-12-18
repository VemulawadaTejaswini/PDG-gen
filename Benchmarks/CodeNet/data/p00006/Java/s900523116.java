import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String input;
    public static void main(String[] args) {
        while(read()){
            slove();
        }
    }
    static  boolean read(){
        if(!sc.hasNext())return false;
        input = sc.nextLine();
        return true;
    }
    static void slove(){
        String res = new StringBuffer(input).reverse().toString();
        System.out.println(res);
        //res = new StringBuffer("1234gtt").reverse().toString();
        //System.out.println(res);
    }
}