import java.util.*;
// import java.io.*;
// import java.time.*;

public class Main {
    static List<List<Integer>> permutations;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            array.add(sc.nextInt());
        }

        List<Integer> input = new ArrayList<>(array);
        Collections.sort(array);

        permutations = new ArrayList<List<Integer>>();
        permutation(array, new ArrayList<>());

        List<Integer> before = new ArrayList<>();

        for (int i = 0; i < permutations.size(); i++) {
            if (permutations.get(i).equals(input)) {
                if (i > 0) printListWithWhiteSpace(before);
                printListWithWhiteSpace(permutations.get(i));
                if (i + 1 < permutations.size()) printListWithWhiteSpace(permutations.get(i + 1));
                break;
            }
            before = permutations.get(i);
        }

        // System.out.print(sb);
        
        sc.close();
    }

    public static void permutation(List<Integer> q, List<Integer> ans){
        // Base Case
        if(q.size() <= 1) {
            List<Integer> tmp = new ArrayList<>();
            tmp.addAll(new ArrayList<>(ans));
            tmp.add(q.get(0));
            permutations.add(tmp);
        }
        // General Case
        else {
            for (int i = 0; i < q.size(); i++) {
                List<Integer> new_q = new ArrayList<>();
                new_q.addAll(new ArrayList<>(q.subList(0, i)));
                new_q.addAll(new ArrayList<>(q.subList(i + 1, q.size())));
                List<Integer> new_ans = new ArrayList<>();
                new_ans.addAll(new ArrayList<>(ans));
                new_ans.add(q.get(i));
                permutation(new_q, new_ans);
            }
        }
    }

    public static void printListWithWhiteSpace(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) sb.append(' ');
        }
        System.out.println(sb);
    }
}

