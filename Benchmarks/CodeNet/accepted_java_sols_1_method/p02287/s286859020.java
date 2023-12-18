import java.util.Scanner;

public class Main {
    
    public static void main(String... strs) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] heap = new int[size];
        for(int i = 0; i < size; i++){
            int element = sc.nextInt();
            heap[i] = element;
        }
        for(int i = 0; i < size; i++) {
            System.out.print("node " + (i+1) + ": ");
            System.out.print("key = " + heap[i] + ", ");
            if(i != 0)
                System.out.print("parent key = " + heap[(i-1)/2] + ", ");
                
            if(2 * i + 1 < size)
                System.out.print("left key = " + heap[2 * i + 1] + ", ");
                
            if(2 * i + 2 < size)
                System.out.print("right key = " + heap[2 * i + 2] + ", ");
                System.out.print("\n");
        }
    }
    
}
