import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int count = 0;
        int t[] = new int[s.length()];
        int t2[] = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
            t[i] = Integer.parseInt(s.substring(i, i+1));
            t2[i] = t[i];
		}

		for (int i = 1; i < s.length(); i++) {
			if (t[i] == t[i-1]) {
				if (t[i] == 0) {
					t[i] = 1;
				} else {
					t[i] = 0;
				}
				count++;
			}
        }
        
        int count2 = 0;
        if (s.length() >= 2 && t2[0] == t2[1]) {
            count2++;
            if (t2[0] == 0) {
                t2[0] = 1;
            } else {
                t2[0] = 0;
            }

            for (int i = 2; i < s.length(); i++) {
                if (t2[i] == t2[i-1]) {
                    if (t2[i] == 0) {
                        t2[i] = 1;
                    } else {
                        t2[i] = 0;
                    }

                count2++;
                }
            }
        }

        if (count2 > 0) {
            if (count < count2) {
                System.out.println(count);
            } else {
                System.out.println(count2);
            }
        } else {
            System.out.println(count);
        }
	}
}
