import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc;// = new Scanner(System.in);
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        boolean S[] = new boolean[13];
        boolean H[] = new boolean[13];
        boolean C[] = new boolean[13];
        boolean D[] = new boolean[13];
        for(int i=0;i<13;i++){
            S[i] = true;
            H[i] = true;
            C[i] = true;
            D[i] = true;
        }

        for(int i=0; i<n; i++){
            String c = sc.next();
            int x = sc.nextInt();
            switch(c){
                case "S":
                    S[x-1] = false;
                    break;
                case "H":
                    H[x-1] = false;
                    break;
                case "C":
                    C[x-1] = false;
                    break;
                case "D":
                    D[x-1] = false;
                    break;
            }
        }

        for(int i=0;i<13;i++){
            if(S[i])System.out.println("S "+(i+1));
        }
        for(int i=0;i<13;i++){
            if(H[i])System.out.println("H "+(i+1));
        }
        for(int i=0;i<13;i++){
            if(C[i])System.out.println("C "+(i+1));
        }
        for(int i=0;i<13;i++){
            if(D[i])System.out.println("D "+(i+1));
        }
    }
}
