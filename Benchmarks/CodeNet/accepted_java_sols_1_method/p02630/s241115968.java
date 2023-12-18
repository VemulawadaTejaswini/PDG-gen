import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
            String path = System.getProperty("user.dir");
          BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            String[] temp = line.split(" ");
            int arraySize = Integer.parseInt(temp[0]);
            int[] array = new int[arraySize];
            long sumOfArray = 0;
            line = br.readLine();
            temp = line.split(" ");
            for (int i = 0; i < arraySize; i++) {
                array[i] = Integer.parseInt(temp[i]);
                sumOfArray += array[i];
            }
            line = br.readLine();
            temp = line.split(" ");
            int inputSize = Integer.parseInt(temp[0]);
            int[][] inputArray = new int[inputSize][2];
            for (int i = 0; i < inputSize; i++) {
                line = br.readLine();
                temp = line.split(" ");
                inputArray[i][0] = Integer.parseInt(temp[0]);
                inputArray[i][1] = Integer.parseInt(temp[1]);
            }
            int[] indexingOfArray = new int[100001];
            for (int i = 0; i < arraySize; i++) {
                indexingOfArray[array[i]]++;
            }
            long[] output = new long[inputSize];
            for (int i = 0; i < inputSize; i++) {
                int preValue = inputArray[i][0];
                int newValue = inputArray[i][1];
                int noOfTimesPreValueCome = indexingOfArray[preValue];
                indexingOfArray[preValue] = 0;
                indexingOfArray[newValue] = indexingOfArray[newValue] + noOfTimesPreValueCome;
                BigInteger bPreValue = new BigInteger(String.valueOf(preValue));
                BigInteger bNewValue = new BigInteger(String.valueOf(newValue));
                BigInteger bNoOfTimesPreValueCome = new BigInteger(String.valueOf(noOfTimesPreValueCome));
                BigInteger bSumOfArray = new BigInteger(String.valueOf(sumOfArray));
                BigInteger bTempOutput = bSumOfArray.subtract( (bPreValue.multiply(bNoOfTimesPreValueCome) ) ).add( (bNewValue.multiply(bNoOfTimesPreValueCome) ) );
                output[i]=bTempOutput.longValue();
                sumOfArray = output[i];
                System.out.println(output[i]);
            }


    }
}
