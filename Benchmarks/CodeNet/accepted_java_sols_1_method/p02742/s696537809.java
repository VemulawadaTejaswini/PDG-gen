import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long hight = scanner.nextInt();
        long width = scanner.nextInt();
//        int[][] array = new int[hight][width];
//        for (int i = 0; i < hight; i++){
//            for (int j = 0; j < width; j++){
//                array[i][j] = 0;
//            }
//        }
        long result;

        if (hight == 1 || width == 1){
            result = 1;
        }else {
            long sum = hight * width;
            if (sum % 2 == 0) {
                result = sum / 2;
            } else {
                result = sum / 2 + 1;
            }
        }


        System.out.println(result);
    }
}
