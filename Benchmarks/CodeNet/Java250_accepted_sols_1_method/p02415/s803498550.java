import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(char c : str.toCharArray()){
            if(65 <= c && c <= 90) System.out.print((char)(c + 32));
            else if(97 <= c && c <= 122) System.out.print((char)(c - 32));
            else System.out.print(c);
        }
        System.out.println();
    }

}