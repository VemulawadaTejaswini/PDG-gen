import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int taroP = 0;
        int hanakoP = 0;
        int num = sc.nextInt();
        while (num > 0) {
            String taroStr = sc.next();
            String hanakoStr = sc.next();
            int result = taroStr.compareTo(hanakoStr);
            if (result > 0) {
                taroP = taroP + 3;
            } else if (result < 0){
                hanakoP = hanakoP + 3;
            }else {
                taroP++;
                hanakoP++;
            }
            num--;
        }
        System.out.println(taroP + " " + hanakoP);
    }
}

