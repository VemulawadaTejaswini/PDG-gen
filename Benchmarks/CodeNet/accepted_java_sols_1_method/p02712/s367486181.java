import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        int[] arr = new int[N];

        long sum=0;

        for(int j=0; j<N; j++){
            arr[j]=j+1;
        }

        for(int i = 0; i<N; i++){
            if ( (arr[i] % 3 ==0) || (arr[i] % 5 ==0)){
                arr[i]=0;
            }else{
                sum= sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}