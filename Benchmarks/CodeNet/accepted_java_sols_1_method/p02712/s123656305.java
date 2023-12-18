import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        long sum=0;

        for (int i = 1; i <=n ; i++) {

            if(i%3==0 && i%5==0)
            {
                //System.out.println("FizzBuzz");
            }
            else if(i%3==0)
            {
                //System.out.println("Fizz");
            }
            else if(i%5==0)
            {
                //System.out.println("Buzz");
            }
            else
            {
                sum+=i;
                //System.out.println(i);
            }
        }

        System.out.println(sum);

    }
}
