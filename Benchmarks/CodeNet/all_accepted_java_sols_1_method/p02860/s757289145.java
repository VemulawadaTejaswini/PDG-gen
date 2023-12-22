import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        if (n % 2 != 0) {
            System.out.print("No");
        } else {
            String hstr = str.substring(0, n/2);
            if (str.equals(hstr+hstr)) {
                System.out.print("Yes");
            } else {
                System.out.print("No");
            }
        }
    }
}