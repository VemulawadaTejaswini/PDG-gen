import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a=0;
        int b=0;
        int c=0;
        int d=0;

        while(x!=0){
            a=x%10;
            x=x-a;
            b=x%100;
            x=x-b;
            c=x%1000;
            x=x-c;
            a=a+b/10+c/100+x/1000;
    
            System.out.printf("%d\n",a);
                 
            a=0;
            b=0;
            c=0;
            d=0;

            x = sc.nextInt();



        }

    }


}
    


    