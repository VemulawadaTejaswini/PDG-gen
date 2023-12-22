import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int small = Integer.parseInt(a[0]);
        int large = Integer.parseInt(a[1]);
        int count = 0;
        //System.out.println(small +"."+ large);
        for(int i=small ; i <= large ; i++){
            int number = i;
            //System.out.println(number);
            List<Integer> n = new ArrayList<Integer>();
            for(int j=0; j<5 ; j++){
                int c =number % 10;
                n.add(c);
                number = number/10;
                //System.out.println(n.get(j));
            }
            if(n.get(0) == n.get(4) && n.get(1) == n.get(3)){
                count++;
                //System.out.println(n.get(0)+" "+ n.get(4)+" "+ n.get(1) +" "+n.get(3));
            }
        }
        System.out.println(count);
    }
}
