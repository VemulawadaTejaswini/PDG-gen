import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int counter = 0;
        int[] array = new int[n*2];
        for(int a=0; a<n*2; a=a+2){
            array[a] = scan.nextInt();
            array[a+1] = scan.nextInt();
            if(Math.sqrt(Math.pow(array[a],2)+Math.pow(array[a+1],2))<=d){
                counter++;
            }
        }
        System.out.println(counter);
        scan.close();
    }
}