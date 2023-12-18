import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cnt=0;
        int[] m, f, r, sum;
        m = new int[50];
        f = new int[50];
        r = new int[50];
        sum = new int[50];

        while(true){
            m[cnt] = sc.nextInt();
            f[cnt] = sc.nextInt();
            r[cnt] = sc.nextInt();
            if(m[cnt] == -1 && f[cnt] == -1 && r[cnt] == -1)
                break;
            sum[cnt] = m[cnt] + f[cnt];
            cnt++;
        }
        for(int i=0; i<cnt; i++){
            if(m[i] == -1 || f[i] == -1){
                System.out.println("F");
            }else if(sum[i] >= 80){
                System.out.println("A");
            }else if(sum[i] >= 65 && sum[i] < 80){
                System.out.println("B");
            }else if(sum[i] >= 50 && sum[i] < 65){
                System.out.println("C");
            }else if(sum[i] >= 30 && sum[i] < 50){
                if(r[i] >= 50){
                    System.out.println("C");
                }else{
                    System.out.println("D");
                }
            }else{
                System.out.println("F");
            }
        }
        sc.close();
    }
}
