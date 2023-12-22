import java.util.Scanner;

class Main{
    public static void main(String[] args){
    final Scanner sc=new Scanner(System.in);
    while(true){
        int m = sc.nextInt();
        int f = sc.nextInt();
        int r = sc.nextInt();
        char G;
        if(m==-1 && f==-1 && r==-1) break;
        if(m ==-1 && f>0 || m > 0 && f==-1)G='F';
        else if(m+f>=80) G='A';
        else if(m+f>=65) G='B';
        else if(m+f>=50) G='C';
        else if(m+f>=30) G='D';
        else G='F';
        if(r>=50)G='C';
        System.out.println(G);
    }
    }
}