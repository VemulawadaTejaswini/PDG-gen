import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }

            int[] score = new int[num];

            for(int i = 0; i < num; i++){
                score[i] = scanner.nextInt();
            }

            double ave;
            double sum = 0;
            for(int s : score){
                sum += s;
            }
            ave = sum / num;
            sum = 0;

            for(int s : score){
                sum += Math.pow(s-ave, 2);
            }

            System.out.println(Math.sqrt( sum / num));
        }

        scanner.close();
    }
}

