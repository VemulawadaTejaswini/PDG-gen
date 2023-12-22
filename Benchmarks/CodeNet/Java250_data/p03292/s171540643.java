import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a1 = Integer.parseInt(sc.next());
        int a2 = Integer.parseInt(sc.next());
        int a3 = Integer.parseInt(sc.next());
        
        int min = Math.abs(a2-a1) + Math.abs(a3-a2);
        if(Math.abs(a3-a1) + Math.abs(a2-a3) < min){
            min = Math.abs(a3-a1) + Math.abs(a2-a3);
        }
        if(Math.abs(a1-a2) + Math.abs(a3-a1) < min){
            min = Math.abs(a1-a2) + Math.abs(a3-a1);
        }
        if(Math.abs(a3-a2) + Math.abs(a1-a3) < min){
            min = Math.abs(a3-a2) + Math.abs(a1-a3);
        }
        if(Math.abs(a1-a3) + Math.abs(a2-a1) < min){
            min = Math.abs(a1-a3) + Math.abs(a2-a1);
        }
        if(Math.abs(a2-a3) + Math.abs(a1-a2) < min){
            min = Math.abs(a2-a3) + Math.abs(a1-a2);
        }
        
        System.out.println(min);
    }
}