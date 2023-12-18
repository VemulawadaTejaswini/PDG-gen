import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0 ; i<n ; i++){
            num[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < n ; i++){
            if(i != 0){
                System.out.print(" ");
            }
            System.out.print(num[n-i-1]);
        }
        System.out.println();
        
    }
}
