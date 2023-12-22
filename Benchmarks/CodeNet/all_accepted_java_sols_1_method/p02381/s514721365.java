import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int sum = 0;
        double ave;
        double s = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            int Length = sc.nextInt();
            if(Length == 0){
                break;
            }
            int[] number = new int[Length];
            for(int i=0; i<Length; i++){
                number[i] = sc.nextInt();
                sum += number[i];
            }
            ave = (double) sum / Length;

            for(int i=0; i<Length; i++){
                s += (number[i] - ave)*(number[i] - ave);
            }
            s /= Length;
            s = Math.sqrt(s);
            //System.out.printf("%d", number[i]);
            System.out.println(s);
            s = 0;
            sum = 0;
        }
        sc.close();
    }
}
