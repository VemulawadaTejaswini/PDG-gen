import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        long sum = 0;
        for(int i = 0; i < a; i++){
            if((i+1) % 3 != 0){
                if((i+1) % 5 != 0){
                    sum = sum + (i+1);
                }
            }
        }
        System.out.println(sum);
    }
}