import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
int A=scan.nextInt();
        int B =scan.nextInt();
        int M=1;
        for(int i=0;i<=A&&M==1;i++){if(i*2+(A-i)*4==B){M=0;}}
        if(M==0){System.out.println("Yes");}
        if(M==1){System.out.println("No");}

    }
    }


