import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] A;
        int i, j;

        A = new int[10000];

        i=0;
        while(true){
            if(i == 10000){break;}
            A[i] = sc.nextInt();
            if(A[i] == 0){break;}
            i++;
        }

        for(j=1;j<=i;j++){
            System.out.println("Case " + j + ": " + A[j-1]);
        }
    }
}

