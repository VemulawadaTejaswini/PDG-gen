import java.util.Scanner;
import java.util.Arrays;
public class Main {
  
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int[] arr=new int[2*N];

        for(int i=0;i<2*N;i++){
            arr[i]=obj.nextInt();}
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<2*N;i+=2){
            //System.out.println(i+" "+arr[i]+" "+arr[i+1]);
            int add=(arr[i]<arr[i+1])?arr[i]:arr[i+1];
            sum=sum+add;
        }
        System.out.println(sum);

    }  
}
