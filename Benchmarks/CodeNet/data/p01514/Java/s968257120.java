import java.util.Scanner;

/**
 * Created by kazuki on 2014/07/05.
 */
public class Main {
    static Scanner s = new Scanner(System.in);

    static class Team {
        public int solveNum;
        public int time;
        public int teamNum;
        public int[] penalty = new int[11];

        Team(int num) {
            solveNum = 0;
            time = 0;
            teamNum = num;
        }

        void addPenalty(int num) {
            penalty[num]++;
        }

    }

    static void sort(Team[] team, int T) {
        Team tmp;

        for(int j=T;j>1;j--){
            for(int i=1;i<j;i++){
                if (team[i].solveNum < team[i+1].solveNum) {
                    tmp = team[i];
                    team[i] = team[i+1];
                    team[i+1] = tmp;
                } else if (team[i].solveNum == team[i+1].solveNum) {

                    if (team[i].time > team[i+1].time) {
                        tmp = team[i];
                        team[i] = team[i+1];
                        team[i+1] = tmp;
                    } else if (team[i].time == team[i+1].time && team[i].teamNum > team[i+1].teamNum) {
                        tmp = team[i];
                        team[i] = team[i+1]                        ;
                        team[i+1] = tmp;
                    }
                }
            }
        }



    }

    public static void main(String[] args) {
        int T, P, R;
        int tID, pID, time;
        String message;
        Team[] team;

        while (true) {
            T = s.nextInt();
            P = s.nextInt();
            R = s.nextInt();

            if(T==0 && P==0 && R==0) break;

            team = new Team[T + 1];
            for (int i = 1; i < T + 1; i++)
                team[i] = new Team(i);

            for (int i = 0; i < R; i++) {
                tID = s.nextInt();
                pID = s.nextInt();
                time = s.nextInt();
                message = s.next();

                if (message.equals("WRONG")) {
                    team[tID].addPenalty(pID);
                } else if (message.equals("CORRECT")) {
                    team[tID].solveNum += 1;
                    team[tID].time += time + team[tID].penalty[pID] * 1200;
                }
            }

            sort(team, T);

            for (int i = 1; i < T + 1; i++)
                System.out.println(team[i].teamNum + " " + team[i].solveNum + " " + team[i].time);
        }
    }
}