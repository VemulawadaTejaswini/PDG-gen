import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            String path = System.getProperty("user.dir");
            // System.out.println(path+"\\src\\com\\meanmedian\\T1Q3Input.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line = br.readLine();
            String temp[] = line.split(" ");

            int arraySize = Integer.parseInt(temp[0]);
            //System.out.println("Size of Array ----> " + arraySize);

            int array[] = new int[arraySize];
            int sumOfArray = 0;
            line = br.readLine();
            temp = line.split(" ");
            for (int i = 0; i < arraySize; i++) {
                array[i] = Integer.parseInt(temp[i]);
                sumOfArray += array[i];
            }
            //System.out.println("Elements in Array");
            for (int element : array) {
                System.out.print(element + "  ");
            }
            System.out.println();
            //System.out.println("Sum of Array ----> " + sumOfArray);
            line = br.readLine();
            temp = line.split(" ");
            int inputSize = Integer.parseInt(temp[0]);
            //System.out.println("Input Size of Array ----> " + inputSize);

            int inputArray[][] = new int[inputSize][2];

            for (int i = 0; i < inputSize; i++) {
                line = br.readLine();
                temp = line.split(" ");
                inputArray[i][0] = Integer.parseInt(temp[0]);
                inputArray[i][1] = Integer.parseInt(temp[1]);
            }
            //System.out.println("Elements in Input Array");
            for (int i = 0; i < inputSize; i++) {
                System.out.println(inputArray[i][0] + " " + inputArray[i][1]);
            }

            // Taking 100000 size array
            int indexingOfArray[] = new int[100001];
            for (int i = 0; i < arraySize; i++) {
                indexingOfArray[array[i]]++;
            }

            int output[] = new int[inputSize];
            // processing in n time
            for (int i = 0; i < inputSize; i++) {
                int preValue = inputArray[i][0];
                // System.out.println("preValue ----> "+preValue);
                int newValue = inputArray[i][1];
                // System.out.println("newValue ----> "+newValue);
                int notOfTimesPreValueCome = indexingOfArray[preValue];
                // System.out.println("notOfTimesPreValueCome ----> "+notOfTimesPreValueCome);
                indexingOfArray[preValue] = 0;
                indexingOfArray[newValue] = indexingOfArray[newValue] + notOfTimesPreValueCome;
                output[i] = sumOfArray - preValue * notOfTimesPreValueCome + newValue * notOfTimesPreValueCome;
                sumOfArray = output[i];
                // System.out.println("output ----> "+output[i]);
            }
            //System.out.println("Output Array");
            for (int element : output) {
                System.out.print(element + "  ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            in.close();
            //System.out.println("\nExit !!!!!!!!!!");
        }



    }

}

