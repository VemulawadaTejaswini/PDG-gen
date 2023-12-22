import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        int H,N,A=0;
        Scanner sc=new Scanner(System.in);
        H=sc.nextInt();
        N=sc.nextInt();
        for(int i=0;i<N;i++){
            A+=sc.nextInt();
        }
        if(H<=A)
        System.out.print("Yes");
        else
        System.out.print("No");
        sc.close();
    }
}