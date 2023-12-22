import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++){
            if (charArr[i] != charArr[charArr.length - 1 - i]){
                System.out.println("No");
                return;
            }
        }
        for (int j = 0; j <= (charArr.length - 2) / 2; j++){
            if (charArr[j] != charArr[(charArr.length - 2) / 2 - j]){
                System.out.println("No");
                return;
            }
        }
        int count = 0;
        for (int k = (charArr.length + 3) / 2 - 1; k < charArr.length; k++){
            if (k == charArr.length - 1 - count){
                break;
            }
            if (charArr[k] != charArr[charArr.length - 1 - count]){
                System.out.println("No");
                return;
            }
            count++;
        }
        System.out.println("Yes");
    }
}
