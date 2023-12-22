import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(",|\n");
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] num;
        num = new int[w];
        int i;
        for(i=0;i<w;i++){
            num[i] = i+1;
        }
        for(int j=0;j<n;j++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int temp = num[a];
            num[a] = num[b];
            num[b] = temp;
        }
        for(i=0;i<w;i++) System.out.println(num[i]);
        sc.close();
    }
}
