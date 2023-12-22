import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        String S = sc.next();

        int pura =0;
        int mai = 0;

        for (int i=0; i<4; i++) {
          if (S.charAt(i) == '+'){
            pura += 1;
          }else if (S.charAt(i) == '-'){
            mai += 1;
          }
        }
        System.out.println(pura - mai);
    }
}
