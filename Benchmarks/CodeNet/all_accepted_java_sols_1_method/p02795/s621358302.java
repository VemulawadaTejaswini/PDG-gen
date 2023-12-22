import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        
        if(h > w){
            if(n%h == 0){
                System.out.println(n/h);
            }else{
                System.out.println(n/h +1);
            }
        }else{
            if(n%w == 0){
                System.out.println(n/w);
            }else{
                System.out.println(n/w +1);
            }
        }
    }
}