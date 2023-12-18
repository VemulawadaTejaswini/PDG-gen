import java.util.Scanner;
class Main {
    int i;
    int min = 1000000;
    int max = -1000000;
    long sum = 0;
    int x;
    int a;
    public void yatary1(){
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if(x == 0){
            max = 0;
            min = 0;
        }else{
        for(i = 1;i <= x;i++){
            a = sc.nextInt();
            sum = sum + a;
            if(x == 1){
                max = a;
                min = a;
            }else if(a > max){
                max = a;
            }else if(a < min){
                min = a;
            }else if (a == min || a == max){
                continue;
            }
        }
        }
        System.out.println(min + " " + max + " " + sum);
    }
    public static void main(String[]args){
        new Main().yatary1();
    }
}