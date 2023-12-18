import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        
        String[] array1 = line1.split(" ");
        String[] array2 = line2.split(" ");
        int hp = Integer.parseInt(array1[0]);
        int n = Integer.parseInt(array1[1]);
        
        
        long sum = 0;
        String result = "No";
        
        for(int i = 0; i < n; i++)
        {
            int buf = Integer.parseInt(array2[i]);
            sum += buf;
            if(sum >= hp)
            {
                result = "Yes";
                break;
            }
        }
        
        System.out.println(result);
    }
}
