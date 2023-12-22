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
        for(int i=n-1; i>0; i--){
            System.out.print(list[i] + " ");
        }
        System.out.println(list[0]);
    }
}