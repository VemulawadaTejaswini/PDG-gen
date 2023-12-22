import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num = swap(num);
        System.out.println(num);
    }

    public static int swap(int num){
        if(num/100 == 9){
            num = num - 800;
        } else if(num/100 == 1){
            num = num + 800;
        } else {}
        
        if(num%100 >= 90 && num%100 <= 99){
            num = num - 80;
        } else if(num%100 >= 10 && num%100 <= 19){
            num = num + 80;
        } else {}

        if(num%10 == 9){
            num = num - 8;
        } else if(num%10 == 1){
            num = num + 8;
        } else {}

        return num;
    }
}