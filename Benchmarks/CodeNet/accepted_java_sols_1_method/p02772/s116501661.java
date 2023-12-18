import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data1 = sc.nextLine();
        String data2 = sc.nextLine();
        
        String[] array = data2.split(" ");
        int n = Integer.parseInt(data1);
        
        String result = "APPROVED";
        for(int i = 0; i < n; i++)
        {
            int buf = Integer.parseInt(array[i]);
            if(buf % 2 == 0)
            {
                if(buf % 3 != 0 && buf % 5 != 0)
                {
                    result = "DENIED";
                    break;
                }
            }
        }
        
        System.out.println(result);
    }
}
