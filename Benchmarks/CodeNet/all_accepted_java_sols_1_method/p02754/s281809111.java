import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        
        String[] array = data.split(" ");
        long n = Long.parseLong(array[0]);
        long a = Long.parseLong(array[1]);
        long b = Long.parseLong(array[2]);
        
        long count = n / (a + b);
        long amari = n % (a + b);
        
        long blue = count * a;
        if(amari <= a)
        {
            blue += amari;
        }
        else
        {
            blue += a;
        }
        
        System.out.println(blue);
    }
}
