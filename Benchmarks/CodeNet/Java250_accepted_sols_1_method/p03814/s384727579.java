import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);
       
        String whole = input.nextLine();
        int Z = 0; 
        
        ArrayList<Integer> lens = new ArrayList<Integer>();
        if (whole.indexOf("A") >= 0 && whole.lastIndexOf("Z") >= whole.indexOf("A"))
        {
            int A = whole.indexOf("A"); // 1
            whole = whole.substring(A); // ABCZ
            Z = whole.lastIndexOf("Z"); // 3
            //lens.add((Z + 1)); // 4
            //whole = whole.substring(Z); // Z
        }
              
        System.out.println(Z+1);
    }
}
