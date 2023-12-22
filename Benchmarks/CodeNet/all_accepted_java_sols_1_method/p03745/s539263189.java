import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        long ans = 1;
        int pos = 0;    //pos: 1 zero: 0, neg: -1
        for(int i=1; i<n; i++){
            if(pos == 0){
                if(a[i] - a[i-1] < 0){
                    pos = -1; 
                }else if(a[i] - a[i-1] > 0){
                    pos = 1;
                }
            }else if(pos == 1){
                if(a[i] - a[i-1] < 0){
                    ans++;
                    pos = 0;
                }
            }else if(pos == -1){
                if(a[i] - a[i-1] > 0){
                    ans++;
                    pos = 0;
                }
            }
        }
        System.out.println(ans);
    }
}        