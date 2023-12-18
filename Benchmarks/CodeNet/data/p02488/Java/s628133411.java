import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0;i<num;i++)
        {
            list.add(sc.next());
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}