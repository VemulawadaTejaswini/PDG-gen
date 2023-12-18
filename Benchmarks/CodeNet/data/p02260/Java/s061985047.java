import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int v;
        int cnt = 0;
        int min;

        for (int i = 0; i < n-1; i++) {
            min = i;
            for (int j = i+1; j < n; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(i != min){
                v = arr[i];
                arr[i] = arr[min];
                arr[min] = v;
                cnt++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(i != 0){System.out.print(" ");}
            System.out.print(arr[i]);
        }
        System.out.println("\n" + cnt);
    }
}
