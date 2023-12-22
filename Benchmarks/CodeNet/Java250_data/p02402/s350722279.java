import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long Max = -10000001;
        long Min = 10000000;
        long Sum = 0;
            for(int i=0;i<n;i++){
                long a = sc.nextLong();
                Sum += a;
                if(Max<a){
                    Max = a;
                }
                if(Min>a){
                    Min = a;
                }
            }
        System.out.println(Min + " " + Max + " " + Sum);
    }
}
