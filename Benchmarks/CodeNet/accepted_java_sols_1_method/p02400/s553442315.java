import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {
 
    while(kbd.hasNext()){
        double r = kbd.nextDouble();
     
        if(r==0){
        ;
        }
        else{
        double x = r*r*Math.PI;
        double y = 2*r*Math.PI;
        System.out.printf("%f %f\n",x,y);
        }
    }
    }
}