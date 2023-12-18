import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int descA = sc.nextInt();
        int descB = sc.nextInt();
        int time = sc.nextInt();
        final int n = descA+descB;
        ArrayList<Integer> list = new ArrayList<>(n);

        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int sum = 0;
        int ans = 0;

        for(int i=0; i<n;i++){
            sum += list.get(i);
            if(sum <= time){
                ans++;
            }else{
                break;
            }
        }

        System.out.println(ans);
    }
}
