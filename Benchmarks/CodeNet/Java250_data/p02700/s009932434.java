import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static class Monster{
		int health, strength;
		
		Monster(int health, int strength){
			this.health = health;
			this.strength = strength;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		Monster ta = new Monster(A, B);
		Monster ao = new Monster(C, D);
		
		while(true) {
			ao.health -= ta.strength;
			if(ao.health <= 0) {
				bw.write("Yes\n");
				break;
			}
			
			ta.health -= ao.strength;
			if(ta.health <= 0) {
				bw.write("No\n");
				break;
			}
			
		}
		
		bw.flush();
	}

}
