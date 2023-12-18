import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc= new Scanner(System.in);
    void run(String args[]){
        Integer limit= sc.nextInt();
        Integer i=0;
        Integer j=0;
        ArrayList<Double>ipair=new ArrayList<>();
        ArrayList<Double>jpair=new ArrayList<>();
        Integer count=0;
        for(i=0;i<=limit;i++){
            ipair.add(sc.nextDouble());
            jpair.add(sc.nextDouble());
        }
        limit=Integer.valueOf(a);
        for(i=1;i<=limit;i++){
            for(j=i;j<=limit;j++){
                if(Math.ceil(jpair.get(j)*ipair.get(i))==Math.floor(jpair.get(j)*ipair.get(i))){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        Main printer = new Main();
        printer.run(args);
    }
}