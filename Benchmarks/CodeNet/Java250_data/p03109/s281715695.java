import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        String val = S.substring(0,4);
        int yyyy = Integer.parseInt(val);

        String val2 = S.substring(5, 7);
        int mm = Integer.parseInt(val2);

        if ((yyyy == 2019 && mm < 5) || yyyy <= 2018) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}