import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] s = new String[n];
      	int[] count = new int[n];
		for(int i=0; i<s.length; i++){
			s[i] = scn.next();
          	count[i] = 0;
		}
      	Arrays.sort(s);
      	int max=0;
      	for(int i=0; i<s.length; i++){
        	for(int j=i+1; j<n; j++){
            	if(s[i].equals(s[j])) count[i]++;
              	else break;
            }
         max = Math.max(max,count[i]);
         i+=count[i];
        }
      	for(int i=0; i<s.length; i++){
        	if(count[i]==max) System.out.println(s[i]);
        }
	}
}
