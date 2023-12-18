import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>100){
            System.exit(-1);
        }
        int[] list = new int[n];
        for(int i=0; i<n; i++){
            list[i] = sc.nextInt();
        }
        System.out.print(list[n-1]);
        for(int i=n-2; i>=0; i--){
            System.out.print(" " + list[i]);
        }
    }
}