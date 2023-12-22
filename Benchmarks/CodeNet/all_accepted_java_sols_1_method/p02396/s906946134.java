import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<Integer>();
        //int x[] = new int[100];
        int count = 0;
        while(true){
            x.add(count,sc.nextInt());
            if(x.get(count)==0)
                break;
            count += 1;
        }
        for(int i = 0; i < count; i++){
            if(!(i==count))
            System.out.println("Case "+(i+1)+": "+x.get(i));
        }
    }
}