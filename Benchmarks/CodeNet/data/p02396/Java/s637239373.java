import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<Integer>();
        //int x[] = new int[100];
        int count = 0;
        for(int i = 0 ; i<100 ; i++){
            x.add(i,sc.nextInt());
            count += 1;
            if(x.get(i)==0)
                break;
        }
        for(int i = 0; i < count-1; i++){
            if(!(i==count))
            System.out.println("Case "+(i+1)+": "+x.get(i));
        }
    }
}