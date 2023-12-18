import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] S = in.next().toCharArray();
        char [] T = in.next().toCharArray();
        int iguales = 0;
        for (int i = 0; i < S.length; i++) {
            if (S[i] == T[i]){
                iguales++;
            }
        }
        System.out.println(iguales);
        
    }
    
}