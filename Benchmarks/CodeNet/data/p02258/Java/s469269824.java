import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++) List.add(sc.nextInt());
        int max = -999999999;
        int min = List.get(0);
        for(int i=1;i<List.size();i++){
            max = Math.max(max,List.get(i)-min);
            min = Math.min(min,List.get(i));
        }
        System.out.println(max);
    }
}
