import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean ans = false;
        String[] strArray = new String [3];
        for(int i=0;i<3;i++) {
            strArray[i] = String.valueOf(str.charAt(i));
        }
        for(int i=0;i<3;i++) {
            if(strArray[i].equals("7")) {
                ans = true;
            }
        }
        if(ans == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
