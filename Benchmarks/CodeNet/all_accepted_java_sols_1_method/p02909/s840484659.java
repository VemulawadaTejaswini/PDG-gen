import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        String w=s.nextLine();
        if(w.equals("Sunny"))
            System.out.print("Cloudy");
        else if(w.equals("Cloudy"))
            System.out.print("Rainy");
        else
            System.out.print("Sunny");}
}
