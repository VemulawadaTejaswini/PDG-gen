import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner scan= new Scanner(System.in);

       int n=scan.nextInt();
       int Array[] =new int[n];
       for(int i=0;i<n;i++){
           Array[i]=scan.nextInt();
           }
       for(int j=n-1;j>0;j--){
           System.out.print(Array[j]+" ");
       }
        System.out.println(Array[0]);
    }
}

