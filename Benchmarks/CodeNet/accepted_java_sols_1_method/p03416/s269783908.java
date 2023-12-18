
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	int pal = 0;
        int d1, d2, d4, d5;
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i = x; i <= y; i++){
            d1 = i/10000;
            d2 = (i/1000)%10;
            d4 = (i%100)/10;
            d5 = i%10;
            if(d1 == d5 && d2 == d4)
                pal++;
        }
      	System.out.println(pal);
    }
}