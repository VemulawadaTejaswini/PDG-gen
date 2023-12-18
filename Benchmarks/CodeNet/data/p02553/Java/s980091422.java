import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    void run(String[] args){
        Scanner scan=new Scanner(System.in);
        Integer a=scan.nextInt();
        Integer b=scan.nextInt();
        Integer c=scan.nextInt();
        Integer d=scan.nextInt();
        Integer max=Integer.MIN_VALUE;
        Integer answer;
        ArrayList<Integer>x=new ArrayList<>();
        ArrayList<Integer>y=new ArrayList<>();
        x.add(a);
        x.add(b);
        y.add(c);
        y.add(d);
        for(Integer i=0;i<2;i++){
            for(Integer j=0;j<2;j++){
                answer=x.get(i)*y.get(j);
                if(max<=answer){
                    max=answer;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        Main printer = new Main();
        printer.run(args);
    }
}