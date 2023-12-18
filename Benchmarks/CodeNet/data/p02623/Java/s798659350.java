import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n + 10];
        int[] b = new int[m + 10];
        int[] c = new int[n + m + 20];
        for(int i = 0 ; i <n ; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < m ; i++){
            b[i] = sc.nextInt();
        }
        int cha = 0;
        int chb = 0; 
        for(int i = 0 ; i < n + m ; i++ ){
            if(a[cha] > b[chb]){
                c[i] = b[chb];
                chb++;
            }else{
                c[i] = a[cha];
                cha++;
            }
        }
        int pp = 0;
        int chi = 0;
        while(pp == 0){
            k = k - c[chi];
            if(k < 0){
                pp = 1;
                chi--;
            }
            if(chi == n + m - 1 && k >= 0){
                pp = 1;
            }
            chi++;
        }
        System.out.println(chi);
        sc.close();
    }
}