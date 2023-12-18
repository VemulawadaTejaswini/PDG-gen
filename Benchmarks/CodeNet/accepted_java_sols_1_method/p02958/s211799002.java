import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> p = new ArrayList<>();
        List<Integer> p2 = new ArrayList<>();
        String result = "NO";
        for(int i=0;i<n;i++){
            int tmp = sc.nextInt();
            p.add(tmp);
            p2.add(tmp);
        }
        sc.close();
        p.sort((a,b)->a-b);
        int count = 0;
        for(int i=0;i<n;i++){
            if(p.get(i)!=p2.get(i))count++;
        }
        if(count==2 || count==0)result="YES";
        System.out.println(result);
    }
}