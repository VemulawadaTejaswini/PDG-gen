import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String peopleInLine = reader.readLine();
        String[] height = reader.readLine().split(" ");

        int[] arrayOfHeights = new int[height.length];
        int amountToBalance = 0;

        for (int a = 0; a < height.length; a++)
        {
            arrayOfHeights[a] = Integer.parseInt(height[a]);
        }

        for(int i = 0; i < Integer.parseInt(peopleInLine) - 1; i++)
        {
            if(arrayOfHeights[i] > arrayOfHeights[i + 1])
            {
                amountToBalance++;
            }
            else
            {
                continue;
            }
        }
        System.out.println(amountToBalance);
    }
}


