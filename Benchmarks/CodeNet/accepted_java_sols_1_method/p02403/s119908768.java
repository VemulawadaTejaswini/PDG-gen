import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] a;
        a = new int[100];

        int[] b;
        b = new int[100];

        int i = 0;
        while(true){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();

            if(a[i]==0 && b[i]==0)
                break;

            i++;
        }

        i=0;
        while(true){
            for(int j = 0;j<a[i];j++){
                for(int k = 0;k<b[i];k++){
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
            i++;
            if(a[i]==0 && b[i]==0)
                break;
        }
    }
}
