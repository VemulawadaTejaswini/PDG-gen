import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i, j, t;
        int cnt = 0;
        int check = 0;
        int mini, minikey;
        int n = sc.nextInt();
        int[] num;
        num = new int[n];

        for(i=0; i<n; i++){
            num[i] = sc.nextInt();
        }

        for(i=0; i<n-1; i++){
            mini =i;
            minikey = num[i];
            for(j=i+1; j < n; j++){
                if(num[j] < minikey){
                    mini = j;
                    minikey = num[j];
                    check++;
                }
            }
            t = num[i];
            num[i] = num[mini];
            num[mini] = t;
            if(check >0)
                cnt++; check=0;
        }

        for(i=0; i<n-1; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println(num[n-1]);
        System.out.println(cnt);
        sc.close();


    }
}
