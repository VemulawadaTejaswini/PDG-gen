import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i=0; i<n; i++){
            int p = sc.nextInt();
            arrayList.add(p);
        }


        int cnt = 0;

        for(int i=0; i<arrayList.size()-2; i++){

            int first = arrayList.get(i);
            int mid = arrayList.get(i+1);
            int last = arrayList.get(i+2);

            int max = Math.max(first, last);
            int min = Math.min(first, last);

            if(min < mid && mid < max){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}