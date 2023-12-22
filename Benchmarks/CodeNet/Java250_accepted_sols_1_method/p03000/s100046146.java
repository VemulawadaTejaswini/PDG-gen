
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            list.add(s.nextInt());
        }
        int count = 0;
        int d =0;
        int i=0;
        while(d<=x){
            count++;
            if(i==n) break;
            d+=list.get(i);
            i++;
        }
        System.out.println(count);
    }
}
