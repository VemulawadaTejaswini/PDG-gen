import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = Integer.parseInt(sc.next());
        int[] c = new int[a];
        
        int min = Integer.MAX_VALUE;
        int total = 0;
        for(int i = 0;i<a;i++){
            c[i] = sc.nextInt();
            if(c[i]<min){
                min = c[i];
            }
            total += c[i];
        }

        int d = b -total;
        int e = d/min;
        System.out.println(a+e);
    }
}