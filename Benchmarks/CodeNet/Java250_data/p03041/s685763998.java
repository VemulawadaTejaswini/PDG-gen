import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        sc.next();
        int k = Integer.parseInt(sc.next());
        String s = sc.next();
        
        char[] c = s.toCharArray();
        if(c[k-1] == 'A'){
            c[k-1] = 'a';
        }else if(c[k-1] == 'B'){
            c[k-1] = 'b';
        }else{
            c[k-1] = 'c';
        }
        
        System.out.println(c);
    }
}