import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
    
public class Main {
    public static void main(String[] args) throws IOException {
        (new Main()).execute();
    }
        
    private void execute() throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true) {
	        Team[] teams = new Team[sc.nextInt()];
	        if(teams.length == 0){break;}
	        
	        int programs = sc.nextInt();
	        for(int i = 0 ; i < teams.length ; i++) {
	        	teams[i] = new Team(i+1, programs);
	        }
	        
	        int logCount = sc.nextInt();
	        for(int i = 0 ; i < logCount ; i++) {
	        	teams[sc.nextInt() - 1].answer(sc.nextInt(), sc.nextInt(), sc.next()); 
	        }
	        
	        Arrays.sort(teams, new TeamComparator());
	        
	        for(Team team : teams) {
	        	System.out.println(team.teamNum + " " + team.collects.size() + " " + team.penalty);
	        }
        }
        sc.close();
    }
    
    private class Team {
    	private static final String CORRECT = "CORRECT";
    	private int[] wrongs;
    	private Set<Integer> collects = new HashSet<Integer>();
    	private int penalty = 0;
    	private int teamNum;

    	Team(int num, int programs) {
    		teamNum = num;
    		wrongs = new int[programs + 1];
    	}

    	void answer(int program, int time, String result) {
    		if(CORRECT.equals(result)) {
    			if(collects.contains(program)){return;}
    			collects.add(program);
    			penalty += wrongs[program]*1200 + time;
    		} else {
    			wrongs[program]++;
    		}
    	}
    }
    
    private class TeamComparator implements java.util.Comparator<Team> {
		@Override
		public int compare(Team o1, Team o2) {
			if(o1.collects.size() != o2.collects.size()) {
				return o2.collects.size() - o1.collects.size();
			} else if(o1.penalty != o2.penalty) {
				return o1.penalty - o2.penalty;
			} else {
				return o1.teamNum - o2.teamNum;
			}
		}
    }
}