import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        long[] array = new long[x];
        long sum = 0;
        for(int i = 0; i < x; i++){
            array[i] = scan.nextInt();
            sum = sum + array[i];
        }




        for(int a = x; a > 0; a--){
            for(int i = 0; i < (a-1); i++){
                if(array[i] > array[i+1]){
                    long t;
                    t = array[i];
                    array[i] = array[i+1];
                    array[i+1] = t;
                }
            }
        }

        System.out.println(array[0] + " " + array[x-1] + " " + sum);


    }
}


