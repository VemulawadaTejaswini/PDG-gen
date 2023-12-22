import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int[] arr_x=new int[N];
        int[] arr_y=new int[M];
        int max_x=X;
        int min_y=Y;
        for(int i=0;i<N;i++){
            arr_x[i]=sc.nextInt();
            if (arr_x[i]>max_x) max_x=arr_x[i];
        }
        for(int i=0;i<M;i++){
            arr_y[i]=sc.nextInt();
            if(arr_y[i]<min_y) min_y=arr_y[i];
        }
        if(max_x<min_y) System.out.println("No War");
        else System.out.println("War");
    }
}
