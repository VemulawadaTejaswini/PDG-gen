import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int n = s.length();
        int k = 0;
        for(int i = 0 ; i < n / 2 ; i++ ){
            if(s.charAt(i) != s.charAt(n - i - 1)){
                k++;
            }
        }
        System.out.println(k);
    }
}