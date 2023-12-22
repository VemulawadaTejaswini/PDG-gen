import java.util.*;
// import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_query = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num_query; i++) {
            int query_type = sc.nextInt();
            int key;
            switch (query_type) {
                case 0:
                    key = sc.nextInt();
                    list.add(key);
                    break;
                case 1:
                    key = sc.nextInt();
                    System.out.println(list.get(key));
                    break;
                case 2:
                    list.remove(list.size()-1);
                    break;
                default:
                    return;
            }
        }

        // System.out.println();
        
        sc.close();
    }
}

