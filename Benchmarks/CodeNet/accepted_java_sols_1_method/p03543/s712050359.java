import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int c1 = -1;
        int count = 1;
        for (int i = 0;i < s.length();++i){
            char c = s.charAt(i);
            if(c1 == -1){
                c1 = c;
            }
            else if(c1 == c){
                ++count;
                if(count >= 3){
                    System.out.println("Yes");
                    return;
                }
            }
            else{
                count = 1;
                c1 = c;
            }
        }
        System.out.println("No");

    }
}