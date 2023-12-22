import java.util.*;
 
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        if(a > b){
            int t = b;
            b = a;
            a = t;
        }
        for(int i = 0; i < b; i++){
            System.out.print(a);
        }
        System.out.println();
    }
}