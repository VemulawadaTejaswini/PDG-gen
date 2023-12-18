import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max=0;
        double min=99999999;
        while(sc.hasNext()){
        	double h=sc.nextDouble();
        	if(h>max)max=h;
        	if(min>h)min=h;
        }
        System.out.println(max-min);
    }
}