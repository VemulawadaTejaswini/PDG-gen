import java.util.*;

public class Main {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] s = new String[N];
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        for(int i=0;i<N;i++){
            s[i] = sc.next() + String.format("%3d",100-sc.nextInt());
            hashMap.put(s[i],i);
        }

        Arrays.sort(s);

        for(int i=0;i<N;i++){
            System.out.println(hashMap.get(s[i])+1);
        }


    }



}
