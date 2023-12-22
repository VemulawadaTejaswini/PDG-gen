import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(true) {
            String line = sc.nextLine();
            int x = Integer.parseInt(line);
            if(x == 0) {
                break;
            }
            list.add(x);
        }
        for(int i = 0; i < list.size(); i++) {
            System.out.println("Case " + (i + 1) + ": " + list.get(i));
        }
         
    }
 } 
