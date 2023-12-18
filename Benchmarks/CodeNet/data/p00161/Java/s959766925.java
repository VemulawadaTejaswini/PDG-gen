import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n == 0) break;

            Team[] t = new Team[n];
            //ArrayList<Team> al = new ArrayList<Team>();

            for(int i = 0; i < n; i++){
                int id = sc.nextInt();
                int[] m = new int[4];
                int[] s = new int[4];

                for(int j = 0; j < 4; j++){
                    m[j] = sc.nextInt();
                    s[j] = sc.nextInt();
                }

                t[i] = new Team(id, m, s);
            }

            Arrays.sort(t);

            System.out.println(t[0].id);
            System.out.println(t[1].id);
            System.out.println(t[n - 2].id);
        }
    }
}

class Team implements Comparable<Team>{
    int id, score;

    Team(int id, int[] m, int[] s){
        this.id = id;
        this.score = 0;

        for(int i = 0; i < 4; i++){
            this.score += m[i] * 60 + s[i];
        }
    }

    public int compareTo(Team t){
        return this.score - t.score;
    }
}