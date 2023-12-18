import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        int N = sc.nextInt();
        for(int a=0;a<N;a++) List.add(sc.nextInt());
        int max = Collections.max(List);
        int num = List.indexOf(max);
        List.remove(num);
        int sum=0;
        for(int a=0;a<List.size();a++) sum+=List.get(a);

        if(sum>max) System.out.println("Yes");
        else System.out.println("No");
    }
}