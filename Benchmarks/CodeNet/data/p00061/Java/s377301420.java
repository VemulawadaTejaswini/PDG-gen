import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int oldRank = -1;
        Scanner sc = new Scanner(System.in);
        List<Team> team = new ArrayList<Team>();
        while (true) {
            String[] in = sc.nextLine().split(",");
            int num = Integer.parseInt(in[0]);
            int ac = Integer.parseInt(in[1]);
            if (num == 0 && ac == 0) {
                break;
            }
            team.add(new Team(num, ac));
        }
        Collections.sort(team, new Team());
        for (Team t : team) {
            if (oldRank == -1) {
                oldRank = t.teamAccept;
            }
            if (oldRank != t.teamAccept) {
                i++;
            }
            t.teamRank = i;
            oldRank = t.teamAccept;
        }
        while (sc.hasNext()) {
            int teamNumber = sc.nextInt();
            for (Team t : team) {
                if (teamNumber == t.teamNumber) {
                    System.out.println(t.teamRank);
                }
            }
        }
    }
}
class Team implements Comparator<Team> {
    public int teamNumber;
    public int teamAccept;
    public int teamRank;

    public Team(int num, int ac) {
        this.teamNumber = num;
        this.teamAccept = ac;
    }

    public Team() {
    }

    public String getTeamString() {
        return "(" + teamNumber + "," + teamAccept + ")" + teamRank;
    }

    public int compare(Team o1, Team o2) {
        int team1 = o1.teamAccept;
        int team2 = o2.teamAccept;
        if (team1 > team2) {
            return -1;
        } else if (team1 == team2) {
            return 0;
        } else {
            return 1;
        }
    }
}