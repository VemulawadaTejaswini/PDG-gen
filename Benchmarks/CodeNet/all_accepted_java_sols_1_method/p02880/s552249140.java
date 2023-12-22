import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= 9; j++)
            {
                int prod = i*j;
                a.add(prod);
            }
        }

        if(a.contains(n))
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

}
