import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        String str = sc.next();
        if (str.equals("-")) {
        break;
        }
        int m = sc.nextInt();
        for(int i=1;i<=m;i++){

            int h = sc.nextInt();
            String firstStr = str.substring(0,h);
            String endStr = str.substring(h);

            str = endStr + firstStr;
        }

        System.out.println(str);    

        
        }

    }
}
