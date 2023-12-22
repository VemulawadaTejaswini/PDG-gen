import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int row, col;
        int[] matrix;

        row = scanner.nextInt();
        col = scanner.nextInt();

        matrix = new int[col];

        int in, sum;
        for(int rowi = 0; rowi < row; rowi++){
            sum = 0;
            for(int coli = 0; coli < col; coli++){
                in = scanner.nextInt();
                matrix[coli] += in;
                sum += in;
                System.out.print(in + " ");
            }
            System.out.println(sum);
        }

        sum = 0;
        for(int i:matrix){
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println(sum);

        scanner.close();
    }
}

