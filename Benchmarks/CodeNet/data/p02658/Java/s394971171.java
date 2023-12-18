import java.util.*;

public class Main {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int n;
int[] A = new int[n];

n = sc.nextInt();

int ans = 1;

for(int i=0; i<n; i++){
    A[i] = sc.nextInt();
}

for(int i=0; i<n; i++){
    ans *= A[i];
}

if (ans <= 1000000000000000000) System.out.println(ans);
else System.out.println(-1);

    }
}