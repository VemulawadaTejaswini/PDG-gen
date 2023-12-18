import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data1 = sc.nextLine();
        String data2 = sc.nextLine();
        
        String[] array1 = data1.split(" ");
        String[] array2 = data2.split(" ");
        
        int n = Integer.parseInt(array1[0]);
        int m = Integer.parseInt(array1[1]);
        
        int sum = 0;
        
        for(int i = 0; i < m; i++)
        {
            int buf = Integer.parseInt(array2[i]);
            sum += buf;
        }
        
        int nokori = n - sum;
        
        if(nokori < 0)
        {
            nokori = -1;
        }
        System.out.println(nokori);
    }
}
