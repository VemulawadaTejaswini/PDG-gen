import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line_array = br.readLine().split(" ");
        int rail_info = Integer.parseInt(line_array[0]);
        int station_info = Integer.parseInt(line_array[1]);
        
        List<String[]> readLine = new ArrayList<String[]>();
        List<int[]> result_value = new ArrayList<int[]>();
        List<int[]> result_minutes = new ArrayList<int[]>();
        String[] read_array;
        for(int i = 0; i < rail_info; i++) {
        	read_array = br.readLine().split(" ");
        	readLine.add(read_array);
        }
        
        for (int idx = 0; idx < rail_info; idx++ ) {
        
        	int[] best_value = new int[station_info];
        	int[] best_minutes = new int[station_info];
        
        	for(int i = 0; i < rail_info; i++) {
        	
        		int start = Integer.parseInt(readLine.get(i)[0]) - 1;
        		int end = Integer.parseInt(readLine.get(i)[1]) - 1;
        		int value = Integer.parseInt(readLine.get(i)[2]);
        		int minutes = Integer.parseInt(readLine.get(i)[3]);
        		if(idx <= start) {
        			if(idx == start) {
        				if(best_value[end] == 0 || best_value[end] > value) {
        					best_value[end] = value;
        				}
        				if(best_minutes[end] == 0 || best_minutes[end] > minutes) {
        					best_minutes[end] = minutes;
        				}
        			} else {
        				if(best_value[end] == 0 || best_value[end] > best_value[start] + value) {
        					best_value[end] = best_value[start] + value;
        				}
        				if(best_minutes[end] == 0 || best_minutes[end] > best_minutes[start] + minutes) {
        					best_minutes[end] = best_minutes[start] + minutes;
        				}
        			}
        		}
        	}
        	result_value.add(best_value);
        	result_minutes.add(best_minutes);
        }
        int N = Integer.parseInt(br.readLine());
        List<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i < N; i++) {
        	String[] line = br.readLine().split(" ");
        	int st = Integer.parseInt(line[0]) - 1;
        	int en = Integer.parseInt(line[1]) - 1;
        	if(Integer.parseInt(line[2]) == 0) {
        		answer.add(result_value.get(st)[en]);
        	} else {
        		answer.add(result_minutes.get(st)[en]);
        	}
        }
        for(int i = 0; i < answer.size(); i++) {
        	System.out.println(answer.get(i));
        }
	}
}