import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int k = scanner.nextInt();

        char[] array = s.toCharArray();

        char al = array[k-1];
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] != al) array[i] = '*';
        }
        
        for(char c: array) {
            System.out.print(c);
        }
        System.out.println();
    }
}