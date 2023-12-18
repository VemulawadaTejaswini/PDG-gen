import java.util.*;
// import java.io.*;
// import java.time.*;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();

        int a = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            array.add(sc.nextInt());
        }

        int b = sc.nextInt();

        int index = 0;
        for (int i = 0; i < b; i++) {
            int tmp = sc.nextInt();
            while (index < a && array.get(index) < tmp) {
                index++;
            }
            if (index == a || array.get(index) != tmp) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
        
        sc.close();
    }
}

