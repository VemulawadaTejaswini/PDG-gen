import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        StringBuilder sb = new StringBuilder(t);
        sb.setLength(t.length() - 1);

        if(s.equals(sb.toString())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
