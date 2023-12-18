import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next(); //予報の天気
        String T = sc.next(); //実際の天気
        int count = 0;

        for (int i = 0; i < 3; i++) {
            if (S.charAt(i) == T.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}