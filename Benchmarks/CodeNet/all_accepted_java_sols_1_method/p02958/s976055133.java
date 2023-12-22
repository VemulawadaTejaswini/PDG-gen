import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        int T=in.nextInt();
        int count=0;
        int[] arr=new int[T];
        for(int i=0;i<T;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<T;i++){
            if(arr[i]!=i+1)
                count++;
        }
        if(count==0 || count==2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}