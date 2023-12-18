import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            String s = sc.next();
            String[] S = s.split(",");
            a[i] = Integer.parseInt(S[0]);
            b[i] = Integer.parseInt(S[1]);
        }
        int[] ans = new int[w];
        for(int i = 0; i < w; i++){
            int x = i + 1;
            for(int j = 0; j < n; j++){
                if(a[j] == x) x = b[j];
                else if(b[j] == x) x = a[j];
            }
            ans[x - 1] = i + 1;
        }

        for(int i = 0; i < w; i++){
            System.out.println(ans[i]);
        }

        sc.close();
        
    }
}

