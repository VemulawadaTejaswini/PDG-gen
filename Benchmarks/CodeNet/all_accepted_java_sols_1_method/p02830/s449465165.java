import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String str1 = sc.next();
        String str2 = sc.next();
        String output = "";
        for(int i = 0;i<N;i++){
            output+=str1.charAt(i) ;
            output+=str2.charAt(i) ;
        }
        System.out.println(output);
    }
}