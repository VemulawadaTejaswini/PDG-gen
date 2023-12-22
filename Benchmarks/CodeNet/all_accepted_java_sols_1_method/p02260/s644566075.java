import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        int[] num = new int[n];
        String line1 = sc.nextLine();
        String[] line1sp = line1.split(" ");
        for(int i = 0; i< n; i++) {
            num[i] = Integer.parseInt(line1sp[i]);
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i; j < n; j++) {
                if(num[j] < num[min]) {
                    min = j;
                }
                if(min != i && j == n-1) {
                    int a = num[min];
                    num[min] = num[i];
                    num[i] = a;
                    count += 1;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(num[i]);
            if(i == n-1) {
                System.out.println("");
            }else {
                System.out.print(" ");
            }
        }
        System.out.println(count);
    }
 }
 
