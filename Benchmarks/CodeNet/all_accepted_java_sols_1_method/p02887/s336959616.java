import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int a = 1;
        for(int i = 1 ; i < n ; i++ ){
            if(s.charAt(i - 1) != s.charAt(i)){
                a++;
            }
        }
        System.out.println(a);
        sc.close();
    }
}