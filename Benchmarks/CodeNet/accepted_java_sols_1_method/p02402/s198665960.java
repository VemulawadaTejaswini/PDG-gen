import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a,sum = 0,max = -1000000, min = 1000000;
        long n = sc.nextLong();
        
        for(int i = 0; i < n; i++){
            a = sc.nextLong();
            if(a < min){
                min = a;
            }
            if(a > max){
                max = a;
            }
            sum+=a;
        }
        System.out.println(min + " " + max + " " + sum);
    }
}

