import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        
        String[] array = data.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        int c = Integer.parseInt(array[2]);
        
        String result = "";
        
        if(a == b && b != c)
        {
            result = "Yes";
        }
        else if(b == c && c != a)
        {
            result = "Yes";
        }
        else if(c == a && a != b)
        {
            result = "Yes";
        }
        else
        {
            result = "No";
        }
        
        System.out.println(result);
    }
}
