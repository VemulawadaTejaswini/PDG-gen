import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        Arrays.sort(array);
        int numOfQuestion = input.nextInt();
        //int[] question = new int[numOfQuestion];
        int count = 0;
        for (int i = 0; i < numOfQuestion; i++) {
            int question = input.nextInt();
            if(BinarySearch(array,question)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean BinarySearch(int[] array, int num){
        int low = 0;
        int height = array.length - 1;
        while (low <= height){
        	 int mid = (low+height)/2;
            if(num == array[mid]){
                return true;
            }else if(num > array[mid]){
                low = mid + 1;
            }else {
                height = mid - 1;
            }
        }
        return false;
    }
}

