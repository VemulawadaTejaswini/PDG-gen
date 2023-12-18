import java.util.Scanner;

class Main{

    static int bubbleSort(int[] a, int n){
        int count = 0;
        int flag = 1;
        while(flag == 1){
            flag = 0;
            for(int i = n - 1; i >= 1; i--){
                if(a[i - 1] > a[i]){
                    int tmp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = tmp; 
                    flag = 1;
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());;
        }

        int bs = bubbleSort(a, n);

        for(int i = 0; i < n - 1; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(a[n - 1]);

        System.out.println(bs);
    }
}
