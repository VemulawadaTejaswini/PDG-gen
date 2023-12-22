import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long count = 0;

        for(int i=1;i<=N;i++){
            int a = i;
            if(i%3==0 || i%5==0){
                a = 0;
            }
            count += a;
        }
        System.out.println(count);
    }
}