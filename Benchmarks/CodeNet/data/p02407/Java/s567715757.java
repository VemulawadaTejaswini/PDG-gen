import java.util.Scanner;

public class Main{
    public static void main(final String[] args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = scanner.nextInt();
        }
        String delimiter = "";
        for(int i=a.length-1; i>=0; i--){
            System.out.print(delimiter);
            System.out.print(a[i]);
            delimiter = " ";
        }
        System.out.println();
    }
}

