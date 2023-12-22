
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        int c;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();        

        String data = reader.readLine();
        c = Integer.parseInt(data);
        int[] array = new int[c];

        data = reader.readLine();
        String[] number = data.split(" ");
        for (int i = 0; i < c ; i++ ) {
            array[i] = Integer.parseInt(number[i]);
        }
        int max = Max(array);
        int min = Min(array);
        long sum = Sum(array);
        builder
           .append(min)
           .append(" ")
           .append(max)
           .append(" ")
           .append(sum);
        System.out.println(builder);
        
    }
    public static int Max (int[] array){
        int i;
        int max = array[0];
        for (i = 0; i < array.length-1 ; i++ ) {
            if ( max < array[i+1])
                max = array[i+1];
        }
        return max;
    }
    public static int Min (int[] array){
        int i;
        int min = array[0];
        for (i = 0; i < array.length-1 ; i++ ) {
            if ( min > array[i+1])
                min = array[i+1];
        }
        return min;
    }
    public static long Sum (int[] array){
        int i;
        long sum = array[0];
        for (i = 0; i < array.length-1 ; i++ ) {
                sum += array[i+1];
        }
        return sum;
    }
}