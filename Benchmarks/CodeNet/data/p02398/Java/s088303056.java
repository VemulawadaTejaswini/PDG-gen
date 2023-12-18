import java.util.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        ArrayList<Integer> divisorArray = new ArrayList<Integer>();

        for(int i = a; i <= b; i++){
            if((c % i) == 0){
                divisorArray.add(i);
            }
        }
        System.out.println(divisorArray.size());
    }
}
