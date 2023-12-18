import java.util.Scanner;
 
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        a=a*p;
        if(p>c) b=b+d*(p-c);
        System.out.println(Math.min(a, b));  
    }
}
