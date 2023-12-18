import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            int [] array;
            array = new int[n];
            int r = sc.nextInt();
            int i;
            for(i=0;i<n;i++){
                array[i] = n-i;
            }
            if(n == 0 && r == 0){
                break;
            }
            int j;
            for(j=0;j<r;j++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                int [] P;
                P = new int[c+p-1];

                for(i=0;i<p-1;i++){
                    P[i]= array[i];
                }
                for(i=0;i<c;i++){
                    P[i+p-1] = array[i+p-1];
                }
                for(i=0;i<c;i++){
                    array[i] = P[i+p-1];

                }
                for(i=0;i<p-1;i++){
                    array[i+c] = P[i];
                }
            }
            System.out.println(array[0]);
        }

        sc.close();
    }
}
