import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; ++i) {
            arr[i] = s.nextInt();
        }
        
        Arrays.sort(arr);
        long comfort = 0;
        if(arr.length >= 2)
            comfort = arr[size-1];
        if(arr.length > 2) {
            for(int i = size - 3; i >= 0; --i) {
                comfort += arr[i+1];
            }
        }
        System.out.println(comfort);
    }
}