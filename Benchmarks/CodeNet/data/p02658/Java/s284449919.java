import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        int product=1;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            product*=arr[i];
        }
        if(product>Math.pow(10,18)){
            System.out.println(-1);
        }
        else {
            System.out.println(product);
        }
    }
}
