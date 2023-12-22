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
        int flag = 1;
        int count = 0;
        while(flag == 1) {
            flag = 0;
            for(int j = n - 1; j > 0; j--) {
                if(num[j] < num[j-1]) {
                    int a = num[j-1];
                    num[j - 1] = num[j];
                    num[j] = a;
                    flag = 1;
                    count++;
                }
            }
        } 
        for(int i = 0; i < n; i++) {
            System.out.print(num[i]);
            if(i < n-1) {
                System.out.print(" ");
            }else {
                System.out.println("");
            }
        }
        System.out.println(count);
            
            
    }
 }
 
