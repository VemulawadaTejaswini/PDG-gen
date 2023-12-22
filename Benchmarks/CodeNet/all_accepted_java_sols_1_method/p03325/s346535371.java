import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();

        for(int i = 0; i < n ; i++){
            l.add(sc.nextInt());
        }
        int t = 0;

            for (int i = 0; i < n; i++) {
                while(l.get(i) % 2 == 0){

                    t++;
                    l.set(i, l.get(i) / 2);
                }
            }
        System.out.println(t);
    }
}