
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int p=0;
for(int a=1;a<N;a++){
    for(int b=1;a*b<N;b++){p++;}
}

System.out.println(p);
    }
}

