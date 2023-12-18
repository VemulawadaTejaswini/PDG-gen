import java.util.Scanner;

public class Main {    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str = sc.next();
        char before = '0';
        int sum = 0;
        for (int i = 0; i < size ; i++) {
            char c = str.charAt(i);
            if(before != c){
                sum++;
                before = c;
            }
        }
        System.out.println(sum);
    }
}