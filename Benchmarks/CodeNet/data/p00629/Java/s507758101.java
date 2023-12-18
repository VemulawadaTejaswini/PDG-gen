import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            Team[] teams = new Team[n];
            for (int i = 0; i < n; i++) {
                teams[i] = new Team(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            }
            HashMap<Integer, Integer> teamCount = new HashMap<>();
            ArrayList<Team> winner = new ArrayList<>();
            Arrays.sort(teams);
            for (Team t : teams) {
                boolean flag = false;
                if (winner.size() < 10) {
                    flag = !teamCount.containsKey(t.group) || teamCount.get(t.group) < 3;
                } else if (winner.size() < 20) {
                    flag = !teamCount.containsKey(t.group) || teamCount.get(t.group) < 2;
                } else if (winner.size() < 26) {
                    flag = !teamCount.containsKey(t.group);
                }
                if (flag) {
                    winner.add(t);
                    if (teamCount.containsKey(t.group)) {
                        teamCount.put(t.group, teamCount.get(t.group) + 1);
                    } else {
                        teamCount.put(t.group, 1);
                    }
                }
            }
            for (Team t : winner) {
                sb.append(t.id).append("\n");
            }
        }
        System.out.print(sb);
    }
    
    static class Team implements Comparable<Team> {
        int id;
        int group;
        int ok;
        int pn;
        
        public Team(int id, int group, int ok, int pn) {
            this.id = id;
            this.group = group;
            this.ok = ok;
            this.pn = pn;
        }
        
        public int compareTo(Team another) {
            if (ok != another.ok) {
                return another.ok - ok;
            } else if (pn != another.pn) {
                return pn - another.pn;
            } else {
                return id - another.id;
            }
        }
        
    }
}
