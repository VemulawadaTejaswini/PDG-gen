import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max = -1000000;
        int min = 1000000;
        long total = 0;
        int a;
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0 ; i<n ; i++){
            a = sc.nextInt();
            if (max < a) max = a;
            if (min > a) min = a;
            total += a;
        }
        sc.close();
        System.out.println(min+" "+max+" "+total);
    }
}
