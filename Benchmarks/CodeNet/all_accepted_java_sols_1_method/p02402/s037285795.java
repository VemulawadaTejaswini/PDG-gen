import java.util.*;                                                                                  

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);

        line = sc.nextLine();
        String[] l = line.split(" ");

        int[] a = new int[n];
        int min = Integer.parseInt(l[0]);
        int max = Integer.parseInt(l[0]);
        long sum = 0;
        for(int i = 0; i < n; i++) {
          a[i] = Integer.parseInt(l[i]);
          if(min > a[i]) {
            min = a[i];
          }   
          if(a[i] > max) {
            max = a[i];
          }   
          sum = sum + a[i];
        }   

        System.out.println(min + " " + max + " " + sum);
    }   
}