import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        
        int sum = 0;
        
        List<Integer> list = new ArrayList<Integer>();
        
        int distance;
        for(int i=0;i<=100;i++){
            for(int j=0;j<N;j++){
                distance = a[j] - i;
                sum += Math.pow(distance,2);
            }
        list.add(sum);
        sum = 0;
        }
        
        Collections.sort(list);
        
        System.out.println(list.get(0));
    }
}
