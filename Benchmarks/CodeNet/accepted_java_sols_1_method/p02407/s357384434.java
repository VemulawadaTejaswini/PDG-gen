import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split(" ");
        sc.close();
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
        for(int i = 0; i<list.size();i++){
            if(i!=list.size()-1){
                System.out.print(list.get(i) + " ");
            }else{
                System.out.println(list.get(i));
                
            }
        }
    }
}


