import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] array;
        array = new int[100];
        int  n = sc.nextInt();

        for(int i=0; i<n ;i++){
            array[i] = sc.nextInt();
        }

        int[] copy;
        copy = new int[100];
        int cnt=0;
        for(int i=n-1; i>=0; i--){
            copy[cnt] = array[i];
            cnt++;
        }

        for(int i=0; i<n; i++){
            if(i!=n-1)
                System.out.print(copy[i] + " ");
            else
                System.out.print(copy[i]);
        }
        System.out.println("");

        sc.close();

    }
}
