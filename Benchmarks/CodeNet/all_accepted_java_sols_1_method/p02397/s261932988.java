import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int tmp;
        
        while (true) {
        
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            if (num1 > num2) {
                tmp = num1;
                num1 = num2;
                num2 = tmp;
            }
            if (num1 == 0 && num2 == 0){break;}
            System.out.println(num1 + " " + num2);
        }
        
    }
}
