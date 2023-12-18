import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer d[] = new Integer [n];
        int count = 1;

        for(int i = 0;i < n;i++){
            d[i] = scanner.nextInt();
        }
        Arrays.sort(d, Comparator.reverseOrder());

        for(int i = 0;i < n - 1;i++){
            if(d[i] > d[i+1]){
                count++;
            }
        }

        System.out.println(count);
    }
}