import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        StringBuilder sb = new StringBuilder();
        sb.append(sc.next());
        sb.setCharAt(3, '8');
        System.out.println(sb);
        sc.close();
    }
}