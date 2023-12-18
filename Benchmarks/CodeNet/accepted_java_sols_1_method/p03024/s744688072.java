import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        sc.close();

        String[] strArray = S.split("");

        int count=0;
        for (int i=0; i<strArray.length; i++){
            if (strArray[i].equals("o")){
                count++;
            }

        }
        int tmp = 8 - (strArray.length - count);

        if (tmp > 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}