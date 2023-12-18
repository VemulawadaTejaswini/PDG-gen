import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		ArrayList<String> m = new ArrayList<String>();
		int s[] = new int[n];

		m.add(scan.next());
		s[0] = scan.nextInt();

		boolean t = false;

		for(int i = 1 ; i < n ; i++) {
			String mm = scan.next();
			for(int j = 0 ; j < m.size() ; j++) {

				if(m.get(j).equals(mm)) {
					s[j] += scan.nextInt();
					t = true;
					break;
				}

			}

			if(t == false) {
				m.add(mm);
				s[m.size()-1] = scan.nextInt();
			}
			t = false;
		}


		Map<String , Integer> map = new HashMap<String , Integer>();


		for(int i = 0 ; i < m.size() ; i++) {
			map.put(m.get(i), (Integer)s[i]);
		}
		Collections.sort(m);


		for(int i = 0 ; i < m.size() ; i++) {
			for(int j = 0 ; j < m.size()-1-i ; j++) {

				if(m.get(j).length() > m.get(j+1).length()) {

					String o = m.get(j);
					m.set(j,m.get(j+1));
					m.set(j+1,o);

				}

			}
		}

		for(int i = 0 ; i < m.size() ; i++) {
			System.out.println(m.get(i)+" "+ map.get(m.get(i)));
		}

	}
}
