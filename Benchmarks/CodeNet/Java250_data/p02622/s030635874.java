import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        char[] s = stdIn.next().toCharArray();
        char[] t = stdIn.next().toCharArray();

        int counter = 0;
        int n = s.length;
        for(int i=0; i<n; i++){
            if(s[i] != t[i])
                counter++;
        }

        System.out.println(counter);
    }
}
