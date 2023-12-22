import java.util.Scanner;
import java.util.TreeSet;
public class Main{
    public static void main(String[] args) {
        TreeSet <Integer> numerosUtiles = new TreeSet<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] numbers = new int [n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
            
        }
        for (int i = 1; i < (n-1); i++) {
            int a = numbers[i-1];
            int b = numbers[i];
            int c = numbers[i+1];
            if ((b>a && b<c) || (b<a && b>c)){
                numerosUtiles.add(b);
            }
        }
        System.out.println(numerosUtiles.size());
    }
      
}