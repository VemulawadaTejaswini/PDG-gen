import java.util.*;

public class Main {
    public static void main (String args[])
    {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        ArrayList<Integer> sum = new ArrayList<>();
        

        for (int x = a; x <= b; x++){
            for (int y = c; y<= d; y++){
                sum.add(x * y);
            }
        }
        Integer max = Collections.max(sum);

        System.out.println(max.toString());

        
    }   
}