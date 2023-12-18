import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        sc.close();

        for(int i=1; i < n; i++){
            result += (n - 1) / i;
        }
        System.out.println(result);
    }    
}