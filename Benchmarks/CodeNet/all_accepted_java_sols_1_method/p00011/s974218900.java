import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] num = new int[w+1];
        sc.nextLine();
        for(int i=1; i<=w; i++){
            num[i] = i;
        }
        for(int i=0; i<n; i++){
            String[] line = sc.nextLine().split(",",0);
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int tmp = num[a];
            num[a] = num[b];
            num[b] = tmp;
        }
        for(int i=1; i<=w; i++){
            System.out.println(num[i]);
        }
    }
}


