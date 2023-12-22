import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String strLine = scan.nextLine();
        scan.close();
        String[] vowel = {"a", "i", "u", "e", "o"};
        boolean flag = false;

        for(int i=0;i<5; i++) {
            if(vowel[i].equals(strLine)){
                flag = true;
            }
        }

        if(flag) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}
