import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        console.nextLine();

        String b = console.nextLine();
        char[] alphabets = b.toCharArray();

        for(int i = 0; i < alphabets.length; i++) {
            int num = alphabets[i];
            if(num + a <= 90){
                alphabets[i] = (char)(num + a);
            }else {
                alphabets[i] = (char)(65 + num + a - 91);
            }
        }
        System.out.println(alphabets);
    }
}