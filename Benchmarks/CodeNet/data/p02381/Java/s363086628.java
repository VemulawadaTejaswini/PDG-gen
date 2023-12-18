import java.io.*;

public class Main{
    public static void main(String[] args){
        double n = 0;
        String line;
        int i = 0, j = 0;
        double[] number;
        double average = 0;
        int sum = 0;
        double sigma = 0;
        double[] deviation;
        deviation = new double[1000];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while(true){
                line = reader.readLine();
                n = Integer.parseInt(line);
                if(n == 0){
                    break;
                }
                number = new double[(int)n];
                line = reader.readLine();
                String[] data = line.split(" ",(int)n);
                for(i = 0; i < n; i++){
                    number[i] = Integer.parseInt(data[i]);
                    sum += number[i];
                }
                average = sum/n;
                for(i = 0; i < n; i++){
                    sigma += Math.pow(number[i] - average, 2.0);
                }
                deviation[j] = Math.sqrt(sigma/(double)n);
                j++;
                sum = 0;
                average = 0;
                sigma = 0;
            }
            
            for(i = 0; i < j; i++){
                System.out.printf("%.8f\n",deviation[i]);
            }         
            
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
