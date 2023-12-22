import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        
        String[] array = data.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        
        int zeinuki = 1;
        
        while(zeinuki <= 1009)
        {
            int zei08 = (int)(zeinuki * 0.08);
            int zei10 = (int)(zeinuki * 0.1);
            if(zei08 == a && zei10 == b)
            {
                break;
            }
            zeinuki++;
        }
        
        if(zeinuki == 1010)
        {
            zeinuki = -1;
        }
        
        System.out.println(zeinuki);
    }
}
