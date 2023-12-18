import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        long ans = k;
        for(int i = 1;i<n;i++){
            ans *= k-1;
        }
        System.out.println(ans);
    }
}
