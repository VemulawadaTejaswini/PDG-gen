import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        String a = "kyoto";
//        String b = "tokyo";

        Scanner cin = new Scanner(System.in);
        String a = cin.nextLine();
        String b = cin.nextLine();
        int len = a.length();
        for (int i=0;i<len;i++){
            if (a.charAt(0)==b.charAt(i)){
                String tempB = b.substring(i, len) + b.substring(0, i);
                //System.out.println(tempB);
                if (tempB.equals(a)) {
                    System.out.println("Yes");
                    return;
                }
            }

        }
        System.out.println("No");
        return;

    }

}