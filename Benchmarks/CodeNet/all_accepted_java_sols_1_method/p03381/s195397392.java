import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        int[] sorted = new int[N];
        for(int n=0;n<N;n++){
        	int x = sc.nextInt();
        	array[n]=x;
        	sorted[n]=x;
        }
        Arrays.sort(sorted);
        
        int leftMed = sorted[N/2-1];
        int rightMed = sorted[N/2];
        
        for(int n=0;n<N;n++){
        	if(array[n]<=leftMed) System.out.println(rightMed);
        	else System.out.println(leftMed);
        }
    }
}