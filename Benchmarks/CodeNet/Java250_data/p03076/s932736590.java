import java.io.*;
import java.util.Arrays;

public class Main {
    private static int[] pos = new int[5];
    private static int k;

    private static int solver() {
        int idx=0;
        int min=10;

        for(int i=0; i<5;i++){
            int rem = pos[i] % 10;
            if(rem != 0  && rem < min){
                min = rem;
                idx = i;
            }
        }

        int sum=0;
        for(int i=0; i<5;i++){
            if(i==idx){
                sum+=pos[i];
            }else{
                sum+=((pos[i] + 9) / 10)*10;
            }
        }

        return sum;

    }


    public static void main(String[] args) {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        try {
            for(int i=0; i<5; i++) {
                String[] inputArray = br.readLine().split(" ");
                pos[i] = Integer.parseInt(inputArray[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(solver());

    }
}