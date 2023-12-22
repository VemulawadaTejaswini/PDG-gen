import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());

        int start = Math.max(a,c);
        int finish = Math.min(b, d);
        if(finish-start>0){
            System.out.println(finish-start);
        }else{
            System.out.println(0);
        }
    }
}