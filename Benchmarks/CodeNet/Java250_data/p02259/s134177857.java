import java.util.Scanner;

class Main{

    static int bubbleSort(int[] a, int n){
        boolean flag = true;
        int cnt = 0;
        while(flag){
            flag = false;
            for(int j = n - 1; j >= 1; j--){
                if(a[j-1] > a[j]){
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;

                    flag = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scn.nextInt();
        }

        int cnt = bubbleSort(a, n);

        for(int i = 0; i < n-1; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(a[n-1]);
        System.out.println(cnt);
    }
}

