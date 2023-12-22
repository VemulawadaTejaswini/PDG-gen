import java.io.*;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int n = Integer.parseInt(num);

        int a[] = new int[100];

        for(int i = 0; i< n;i++){
            String str = scanner.next();
            int x = Integer.parseInt(str);
            a[i]=x;
        }

        for(int i = n - 1; i >=0;i--){
            if(i == 0){
                System.out.print(a[i]+"\n");
            }else{
                System.out.print(a[i]+" ");
            }
        }

    }
}

