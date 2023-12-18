import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        String order;
        for(int i = 0; i < q; i++){
            order = sc.next();
            if(order.equals("print")) print(str, sc.nextInt(), sc.nextInt());
            else if(order.equals("reverse")) str = reverse(str, sc.nextInt(), sc.nextInt());
            else if(order.equals("replace")) str = replace(str, sc.nextInt(), sc.nextInt(), sc.next());
        }
    }

    public static void print(String str, int a, int b){
        System.out.println(str.substring(a, b + 1));
    }

    public static String reverse(String str, int a, int b){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a; i++){
            sb.append(str.charAt(i));
        }
        for(int i = b; i >= a; i--){
            sb.append(str.charAt(i));
        }
        for(int i = b + 1; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String replace(String str, int a, int b, String p){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a; i++){
            sb.append(str.charAt(i));
        }
        sb.append(p);
        for(int i = b + 1; i < str.length(); i++){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}

