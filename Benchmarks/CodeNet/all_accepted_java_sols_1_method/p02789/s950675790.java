import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        
        String[] array1 = line1.split(" ");
        int n = Integer.parseInt(array1[0]);
        int m = Integer.parseInt(array1[1]);
        
        String result = "No";
        
        if(n == m)
        {
            result = "Yes";
        }
        
        System.out.println(result);
    }
}
