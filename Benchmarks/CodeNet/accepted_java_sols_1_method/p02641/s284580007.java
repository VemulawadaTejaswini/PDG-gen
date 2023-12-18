import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        int sa = 1000;
        int num = 0;
        
        for(int i=0; i<N; i++){
            int n = scanner.nextInt();
            set1.add(n);
        }
        
        for(int i=0; i<100; i++){
            if(!set1.contains(i+1)){
                set2.add(i+1);
            }
        }
        
        for(int i: set2){
            if(Math.abs(i-X)<sa){
                sa = Math.abs(i-X);
                num = i;
            }
        }
        
        if(X<=50){
            if(X<=Math.abs(num-X)){
                System.out.println(0);
            }else{
                System.out.println(num);
            }
        }else{
            if(101-X<Math.abs(num-X)){
                System.out.println(101);
            }else{
                System.out.println(num);
            }
        }
        
    }
}
