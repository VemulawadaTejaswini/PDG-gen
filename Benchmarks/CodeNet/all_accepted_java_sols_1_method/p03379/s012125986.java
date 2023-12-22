import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int ints[]=new int[N];
        int originInts[]=new int[N];
        for(int i=0;i<N;i++){
            ints[i]=scanner.nextInt();
            originInts[i]=ints[i];
        }
        Arrays.sort(ints);
        if(ints[N/2]==ints[N/2-1]){
            for(int i=0;i<N;i++){
                System.out.println(ints[N/2]);
            }
            return;
        }
        for(int i=0;i<N;i++){
            if((ints[N/2-1]+ints[N/2])/2.0>originInts[i]){
                System.out.println(ints[N/2]);
            }else{
                System.out.println(ints[N/2-1]);
            }
        }
    }
}
