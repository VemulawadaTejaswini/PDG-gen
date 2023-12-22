import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> p = new ArrayList<>();
        for (int i=0;i<n;i++){
            p.add(sc.nextInt());
        }
        int answer=0;
        int count = 0;
        boolean b = true;
        while (b){

            if (!p.contains(x-count)){
                answer=x-count;
                b=false;
            }
            if (b&&!p.contains(x+count)){
                answer=x+count;
                b=false;
            }
            count++;
        }
        System.out.println(answer);
    }
}