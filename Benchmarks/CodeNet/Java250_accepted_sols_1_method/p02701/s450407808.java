import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        
        for(int i = 0; i <= a; i++){
            String x = s.nextLine();
            list.add(x.toLowerCase());
        }
        Collections.sort(list);
        Collections.reverse(list);
        list2.add(list.get(0));
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).length() <= 10 && list.get(i).length() >= 1 && !list.get(i).equals(" ") && !(list.get(i).equals(list2.get(list2.size()-1)))){
                list2.add(list.get(i));
            }
        }
        System.out.println(list2.size());
    }
}