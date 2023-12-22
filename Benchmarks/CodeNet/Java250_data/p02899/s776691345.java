import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int size= 0;
        size=scan.nextInt();

        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int[] ans = new int[size];
        for(int i=0;i<size;i++){
            ans[arr[i]-1]=i+1;
        }
        for(int c:ans){
            System.out.print(c+" ");
        }
    }
}
