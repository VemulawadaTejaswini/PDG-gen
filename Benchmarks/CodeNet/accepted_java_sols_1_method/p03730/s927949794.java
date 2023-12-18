import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i <= b; i++){
            int surplus = a*i % b;
            if(list.contains(surplus)){
                break;
            } else {
                list.add(surplus);
            }
        }

        if(list.contains(c)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}