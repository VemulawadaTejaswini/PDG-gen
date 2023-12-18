import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> intlist  = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            intlist.add(sc.nextInt());
            if(intlist.get(intlist.size() - 1) == 0){
                break;
            }
            System.out.println("Case " + intlist.size() +": " + intlist.get(intlist.size() - 1));
        }
    }
}
