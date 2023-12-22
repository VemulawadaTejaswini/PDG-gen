import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<a;i++)
        {
            map.putIfAbsent(sc.next(),1);

        }
        System.out.print(map.size());


    }
}