
import java.util. ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        while(sc.hasNext()== true ){
            a.add(sc.nextInt());
        }
        int sumo = 0;
        for (int i =0; i<a.size(); i++){
            sumo += a.get(i);
        }
        sumo -= a.get(0);
        sumo -= a.get(1);
        int ans = a.get(0) - sumo;
        if( a.get(0)< sumo){
            System.out.println(-1);
        }else{
            System.out.println(ans);
        }
    }
}
