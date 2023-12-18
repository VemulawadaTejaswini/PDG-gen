import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int array[] = new int[n];

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            array[i] = a;
        }

        for(int j = n - 1; j >= 0; j--){
            if(j == 0){
                System.out.print(array[j]);
            }else{
                System.out.print(array[j] + " ");
            }
        }
        System.out.println();
    }
}
