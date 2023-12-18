import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int i = 1;
        
        while (true) {
            num = sc.nextInt();
            if(num == 0) {
                break;
            }
            System.out.println("Case " + i + ": " + num);

            i++;
        }
    }
}
