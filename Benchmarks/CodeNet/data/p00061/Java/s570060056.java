import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Team> t = new ArrayList<>();
        while (true) {
            Integer[] list = Arrays.stream(sc.nextLine().split(",")).map(Integer::parseInt).toArray(Integer[]::new);
            if (list[0] == 0 && list[1] == 0) {
                break;
            }
            t.add(new Team(list[0], list[1]));
        }
        Team[] tt = t.stream().sorted(Comparator.comparing(Team::getSocre, Comparator.reverseOrder())).toArray(Team[]::new);
        tt[0].rank = 1;
        for (int i = 1; i < tt.length; i++) {
            if (tt[i - 1].getSocre() == tt[i].getSocre()) {
                tt[i].rank = tt[i-1].rank;
            } else {
                tt[i].rank = tt[i-1].rank + 1;
            }
        }
        tt = t.stream().sorted(Comparator.comparing(Team::getNumber)).toArray(Team[]::new);
        while (sc.hasNext()) {
            int n = sc.nextInt()-1;
            System.out.println(tt[n].rank);
        }
    }

    static class Team {
        int number;
        int score;
        int rank;
        Team(int number, int score) {
            this.number = number;
            this.score = score;
        }
        int getSocre() {
            return score;
        }
        int getNumber() {
            return number;
        }
    }
}

