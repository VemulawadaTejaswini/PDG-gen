import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder str = new StringBuilder(s);
        int k = sc.nextInt();

        char c = s.charAt(k-1);

        for (int i=0; i<n; i++){
            if(str.charAt(i)!=c){
                str.setCharAt(i, '*');
            }
        }
        System.out.println(str);

    }
}
