import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] c = new int[a*2-1];
        int d = b - a + 1;
        for(int i = 0;i < c.length; i++){
            c[i] = d;
            d++;
        } 
        for(int i = 0; i < c.length;i++){
            if(i != 0){
                System.out.print(" ");
            }
            System.out.print(c[i]);
        }
    }
}