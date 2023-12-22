import java.util.Scanner;
class Main{
    static public void  main(String[] av){

        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
if( b >a){
    int t = a;
    a=b;
    b=t;
}
int sum=0;
        while (a%b!=0){
            int t;
t=a%b;
a=b;
b=t;
    }




System.out.println(b);       
    }
    
}
