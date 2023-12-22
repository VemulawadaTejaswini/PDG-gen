import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        StringBuilder sb = new StringBuilder();
        sb.append(t);
        sb.setLength(t.length() - 1);

        if(sb.toString().equals(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
