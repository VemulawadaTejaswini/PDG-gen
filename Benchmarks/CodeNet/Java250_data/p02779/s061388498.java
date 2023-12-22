import java.util.Scanner;
import java.util.Arrays;
// import java.util.HashMap;
// import java.util.List;
// import java.util.ArrayList;
// import java.util.Map.Entry;
// import java.util.Comparator;
// import java.io.IOException;
// import java.io.InputStream;
// import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A[] = new long[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);
        boolean ok = true;
        for(int i = 0; i < N-1; i++){
            if(A[i] == A[i+1]) ok = false;
        }
        if(ok){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        




    }
 
}