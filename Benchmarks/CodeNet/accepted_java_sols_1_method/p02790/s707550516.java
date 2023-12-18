import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder A = new StringBuilder();
        StringBuilder B = new StringBuilder();
        ArrayList<String> S = new ArrayList<>();
        for(int i=0;i<a;i++) A.append(b);
        for(int i=0;i<b;i++) B.append(a);
        S.add(A.toString());
        S.add(B.toString());
        Collections.sort(S);
        System.out.println(S.get(0));
    }
}