import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        d = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        for(int i = a; i < b + 1; i++){
            if(c%i == 0){
                d = d + 1;
            }
        }
        System.out.println(d);
    }
}
