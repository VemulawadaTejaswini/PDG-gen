import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] values = new int[w];
        int i;
        int A;
        int B;

        for(i=0;i<values.length;i++){
            values[i] = i + 1;
        }

        for(i=0;i<n;i++){
            String str = sc.next();
            String[] ab = str.split(",");

            int a = Integer.parseInt(ab[0]) - 1;
            int b = Integer.parseInt(ab[1]) - 1;      

            A = values[a];
            B = values[b];
            
            values[a] = B;
            values[b] = A;

        }

        for(i=0;i<values.length;i++){
            System.out.printf("%d\n",values[i]);

        }

        sc.close();

    }

}
