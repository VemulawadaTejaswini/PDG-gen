import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);
       
        String whole = input.nextLine();
        
        ArrayList<Integer> lens = new ArrayList<Integer>();
        while (whole.indexOf("A") >= 0 && whole.lastIndexOf("Z") >= whole.indexOf("A"))
        {
            int A = whole.indexOf("A"); // 1
            whole = whole.substring(A); // ABCZ
            int Z = whole.lastIndexOf("Z"); // 3
            lens.add((Z + 1)); // 4
            whole = whole.substring(Z); // Z
        }
        
        int largest = 0;
        for (int i = 0; i < lens.size(); i++)
        {
            if (lens.get(i) > largest)
            {
                largest = lens.get(i);
            }
        }
        
        System.out.println(largest);
    }
}