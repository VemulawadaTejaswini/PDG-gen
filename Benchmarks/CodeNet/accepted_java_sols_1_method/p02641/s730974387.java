import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        ArrayList<Integer> p = new ArrayList<>();
        for(int i = 0; i < n; i++) p.add(scan.nextInt());
        if(!p.contains(x)){
            System.out.println(x);
            return;
        }
        for(int i = 1; i <= 500; i++){
            if(!p.contains(x - i)){
                System.out.println(x - i);
                return;
            }else if(!p.contains(x + i)){
                System.out.println(x + i);
                return;
            }
        }
        scan.close();
    }
}