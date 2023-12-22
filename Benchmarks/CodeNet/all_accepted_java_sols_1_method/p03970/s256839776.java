import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char[] codefes = {'C','O','D','E','F','E','S','T','I','V','A','L','2','0','1','6'};
        char[] str = scan.next().toCharArray();

        int count = 0;
        for (int i = 0; i < codefes.length; i++){
            if (codefes[i] != str[i]) count++;
        }
        System.out.println(count);
    }
}