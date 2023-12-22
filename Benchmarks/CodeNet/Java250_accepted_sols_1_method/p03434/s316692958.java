import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[]=new int[N];
        for(int i=0; i<N; i++){
            a[i]=sc.nextInt();
        }

        Arrays.sort(a);
        int Ali=0;
        int Bob=0;

        for(int i=1; i<=N; i=i+2){
            Ali = Ali+a[N-i];
            if(N-i-1>=0){
                Bob = Bob+a[N-i-1];
            } 
        }
  
        System.out.println(Ali-Bob);

        


    }
}