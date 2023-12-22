import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a2 = a;
        int b = sc.nextInt();
        int c = sc.nextInt();
        int e = Math.abs(a-b);

        if(e < c && e != 0){
            c = e;
        }
        Set<Integer> set = new TreeSet<>();

        for(int i = 0;i<c;i++){
            set.add(a++);
        }
        for(int i = 0;i<c;i++){
            set.add(b--);
        }
        if(e == 0){
            System.out.println(a2);
        }else{
            for(Integer d:set){
                System.out.println(d);
            }
        }
    }
}