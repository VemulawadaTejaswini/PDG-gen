import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.next());
        List<Integer> v = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        for(int i = 0; i < n; i++)
            v.add(Integer.parseInt(s.next()));
        for(int i = 0; i < n; i++)
            c.add(Integer.parseInt(s.next()));

        int now = 0;
        for(int i = 0; i < n; i++){
            int vvalue = v.get(i);
            int cvalue = c.get(i);
            if(vvalue - cvalue > 0)
                now += vvalue - cvalue;
        }

        System.out.println(now);
    }

}
