import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        int ans = 0;

        for(int i=0; i<n; i++){
            int input = sc.nextInt();
            array[i] = input;
        }

        for(int i=0; i<n; i++){
            ans += search(array, 0, i);
        }


        System.out.println(ans);
    }
    public static int search(int[] array, int count, int index){
        if(array[index] % 2 != 0){
            return count;
        } else {
            array[index] /= 2;
            count++;
            return search(array, count, index);
        }
    }
}
