import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int S[] = new int[100000];
        for(int i = 0; i < n; i++)
            S[i] = scanner.nextInt();
        int q = scanner.nextInt();
        int T[] = new int[50000];
        for(int i = 0; i < q; i++)
            T[i] = scanner.nextInt();
        scanner.close();

        int amount = 0;
        for(int i = 0; i < q; i++){
            if(search(0, n - 1, S, T[i]))
                amount++;
        }
        System.out.println(amount);
    }

    public static boolean search(int s, int e, int[] A, int p){
        if(s == e){
            if(A[s] == p)
                return true;
            else
                return false;
        }
        else{
            if(A[(s + e)/2] == p)
                return true;
            else if(A[(s + e)/2] > p)
                return search(s, (s + e)/2, A, p);
            else
                return search((s + e)/2 + 1, e, A, p);
        }
    }

}

