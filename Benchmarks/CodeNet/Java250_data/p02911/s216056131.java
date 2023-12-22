import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int defaultPoint = sc.nextInt();
        int answers = sc.nextInt();
        int[] answerers = new int[answers];
        for(int i=0; i<answers; i++){
            answerers[i] = sc.nextInt()-1;
        }
        solve(people,defaultPoint,answerers);
    }

    public static void solve(int people, int defPoint, int[] answerers){
        int[] correctAns = new int[people];
        for(int i: answerers){
            correctAns[i]++;
        }
        for(int i: correctAns){
            System.out.println(i > answerers.length - defPoint ? "Yes" : "No");
        }
    }
}