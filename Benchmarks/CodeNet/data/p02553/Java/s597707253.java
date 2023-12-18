import java.util.Scanner;

public class Main {
    void run(String[] args){
        Scanner scan=new Scanner(System.in);
        long a=scan.nextLong();
        long b=scan.nextLong();
        long c=scan.nextLong();
        long d=scan.nextLong();
        long max=Long.MIN_VALUE;
        long answer;
        answer=a*c;
        if(max<answer){
            max=answer;
        }
        answer=a*d;
        if(max<answer){
            max=answer;
        }
        answer=b*c;
        if(max<answer){
            max=answer;
        }
        answer=b*d;
        if(max<answer){
            max=answer;
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        Main printer = new Main();
        printer.run(args);
    }
}