import java.util.Scanner;

class Main{
    public static void main(String[] args){   
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int ans=B%A==0?A+B:B-A;
        System.out.println(ans);
    }
}