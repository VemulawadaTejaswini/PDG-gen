import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String  tmp  = sc.nextLine();
        int N = Integer.parseInt(tmp);
        String rmp  = sc.nextLine();
        String S[] = new String[N];
        if (N%2!=0){
            System.out.println("No");
            System.exit(0);
        }


        for (int i =0; i < N;i++){
            S[i] = rmp.substring(i,i+1);
        }
        for (int i = 0;i<N/2;i++){
            if(!S[i].equals(S[i+N/2])){
                System.out.println("No");
                System.exit(0);
            }
        }

        System.out.println("Yes");


    }
}
