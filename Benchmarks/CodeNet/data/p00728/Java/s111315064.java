import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while(true){
            int count = scn.nextInt();

            if(count == 0) break;

            int[] array;
            array = new int[count];

            int max = 0;
            int min = 1000;

            int mx_i = 0;
            int mn_i = 0;
            int sum = 0;
            int ave = 0;

            for (int i = 0; i < count; i++){
                array[i] = scn.nextInt();
                if(array[i] >= max) {
                    max = array[i];
                    mx_i = i;
                }
                if(array[i] <= min) {
                    min = array[i];
                    mn_i = i;
                }
                sum += array[i];
            }

            sum = sum - array[mx_i] - array[mn_i];

            ave = sum / (count - 2);

            System.out.println(ave);
        }
    }
}
