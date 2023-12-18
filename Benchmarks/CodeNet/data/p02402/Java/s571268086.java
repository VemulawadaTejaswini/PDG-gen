import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> set = new ArrayList<>(num);
        for(int i=0;i<num;i++){
            set.add(sc.nextInt());
        }
        GetMinMaxSum gmms = new GetMinMaxSum();
        System.out.println(gmms.min(set) + " " + gmms.max(set) + " " + gmms.sum(set));
    }
}
class GetMinMaxSum{
    long ret = 0;
    long sum(ArrayList<Integer> list){
        ret = 0;
        for(int a : list){
            ret += a;
        }
        return ret;
    }
    long max(ArrayList<Integer> list){
        Collections.sort(list);
        ret = list.get(list.size()-1);
        return ret;
    }
    long min(ArrayList<Integer> list){
        Collections.sort(list);
        ret = list.get(0);
        return ret;
    }
}