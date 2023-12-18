import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.nextLine();
        String t = stdIn.nextLine();
        int c = 0;
        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) != t.charAt(i)){
                c += 1;
            }
        }
        System.out.println(c);
    }
}
