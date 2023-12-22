import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("");
        int x = 111;
        int d3 = sc.nextInt();
        int d2 = sc.nextInt();
        int d1 = sc.nextInt();
        if(d3<d2){
            x = (d3+1)*111;
        }else if(d3>d2){
            x = d3*111;
        }else{
            if(d1<=d2) x=d3*111;
            else x= (d3+1)*111;
        }
        System.out.println(x);
    }
}