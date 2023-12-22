import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] p = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            p[i] = Integer.parseInt(sc.next());
            if(p[i]!=i+1){
                sum++;
            }
        }
        if(sum==2 || sum==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}