
import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int N=s.nextInt();
        int k=s.nextInt();
        
        int[] arr=new int[N];
        
        for(int i=0;i<N;i++) {
        	int x=s.nextInt();
        	arr[i]=x;
        }
        Arrays.sort(arr);
        int p=0;
        for(int i=0;i<k;i++) {
        	p=p+arr[i];
        }
        System.out.println(p);
        
         s.close();
    }
}
