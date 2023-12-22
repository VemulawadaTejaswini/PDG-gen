import java.util.Scanner;

public class Main {
    public static void main(String main[]){
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        int tor= 0;
        for(int i = 0;i< a.length ;i++){
           tor += (a[i]==b[i]?1:0);
        }
        System.out.println(tor);
    }
}