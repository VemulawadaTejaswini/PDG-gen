import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        int count = 0;
        while(true){
            x.add(count,sc.nextInt());
            y.add(count,sc.nextInt());
            if((x.get(count)==0)&&(y.get(count)==0))
                break;
            count += 1;
        }
        for(int i = 0; i < count ; i++){
            System.out.println(Math.min(x.get(i),y.get(i))+" "+Math.max(x.get(i),y.get(i)));
        }
    }
}