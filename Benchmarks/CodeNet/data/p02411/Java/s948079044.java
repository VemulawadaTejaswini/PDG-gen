import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> score = new ArrayList<Integer>();
        while(sc.hasNext()){
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            if(m == -1 && f == -1 && r == -1){
                break;
            }else{
                score.add(m);
                score.add(f);
                score.add(r);
            }
        }
        for(int i = 0; i < score.size() / 3; i++){
            int m = score.get(i * 3);
            int f = score.get(i * 3 + 1);
            int r = score.get(i * 3 + 2);
            if(m == -1 || f == -1){
                System.out.println("F");
            }else if(m + f >= 80){
                System.out.println("A");
            }else if(m + f >= 65){
                System.out.println("B");
            }else if(m + f >= 50){
                System.out.println("C");
            }else if(m + f >= 30){
                if(r >= 50){
                    System.out.println("C");
                }else{
                    System.out.println("D");
                }
            }else{
                System.out.println("F");
            }
        }
    }
}
