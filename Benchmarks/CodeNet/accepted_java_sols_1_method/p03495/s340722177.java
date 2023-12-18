import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static int queryCount=0;
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int K=scanner.nextInt();
        int[] ints=new int[N];
        int[] counts=new int[N];
        for(int i=0;i<N;i++){
            ints[i]=scanner.nextInt();
            counts[ints[i]-1]++;
        }
        int kind=0;
        for(int i=0;i<N;i++){
            if(counts[i]>0) kind++;
        }
        int[] n_1=new int[kind];
        int index=0;
        for(int i=0;i<counts.length;i++){
            if(counts[i]>0){
                n_1[index]=counts[i];
                index++;
            }
        }
        Arrays.sort(n_1);
        int result=0;
        for(int i=0;i<n_1.length;i++){
            if(kind<=K)break;
            result+=n_1[i];
            kind--;
        }

        System.out.println(result);
    }
}
