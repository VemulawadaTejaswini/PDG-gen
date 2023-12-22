import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        
        String[] array = line2.split(" ");
        int n = Integer.parseInt(line1);
        
        int min = Integer.parseInt(array[0]);
        int count = 1;
        for(int i = 1; i < n; i++)
        {
            int buf = Integer.parseInt(array[i]);
            if(buf < min)
            {
                min = buf;
                count++;
            }
        }
        
        System.out.println(count);
    }
}
