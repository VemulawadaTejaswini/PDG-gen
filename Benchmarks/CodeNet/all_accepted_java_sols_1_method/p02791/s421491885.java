import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int number[] = new int[n];
        int mini = Integer.MAX_VALUE;
        int count = 0;

        for(int i = 0; i < n;i++) number[i] = scan.nextInt();
        scan.close();

        for(int j = 0; j < n;j++){
            mini = Math.min(mini,number[j]);
            if(mini >= number[j]) count++;
        }

        System.out.println(count);
    }
}