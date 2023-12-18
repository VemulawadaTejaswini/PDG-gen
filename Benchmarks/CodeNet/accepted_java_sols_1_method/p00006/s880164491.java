import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String ans = new StringBuffer(in.next()).reverse().toString();
            System.out.println(ans);
        }
    }
}