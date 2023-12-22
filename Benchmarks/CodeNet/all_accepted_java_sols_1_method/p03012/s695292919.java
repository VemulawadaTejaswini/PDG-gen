import java.util.Scanner;
import java.util.ArrayList;


public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        ArrayList<Integer> Array = new ArrayList<Integer>();
        int l,r,abs=10000,temp;

        for(int i = 0; i<num1;i++){
            int num2 = scan.nextInt();
            Array.add(num2);
        }
        for(int i = 0; i<num1;i++){
            l = r = 0;
            for(int j = 0; j<num1;j++){
                if(j <= i)  l += Array.get(j);
                else        r += Array.get(j);
            }
            if(r > l) temp = r-l;
            else      temp = l-r;
            if(abs > temp)  abs = temp;
        }

        System.out.println(abs);
    }
}