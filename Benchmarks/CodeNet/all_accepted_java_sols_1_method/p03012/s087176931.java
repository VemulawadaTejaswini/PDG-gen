import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int data[] = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        int s1 = 0;
        int s2 = 0;

        int index = 0;
        int i = 0;
        int j = n - 1;

        while (index < n) {
            if (s1 < s2) {
                s1 += data[i];
                i++;
            } else {
                s2 += data[j];
                j--;
            }
            index++;
        }

        if (s1 >= s2) {
            System.out.println(s1 - s2);
        } else {
            System.out.println(s2 - s1);
        }
	}
}