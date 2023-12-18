
import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            String s = sc.next();
            int k = Integer.parseInt(sc.next());
            int[][] dic = new int[s.length()][4];
            int temp = 0;
            int temp2 = 0;
            int j = 1;
            
            for(int i=0; i<s.length(); i++){
            	dic[i][0] = i;
            	dic[i][1] = s.charAt(i);
            	dic[i][2] = 0;
            	dic[i][3] = i;
            }
            
            Arrays.sort(dic, (a, b) -> Integer.compare(a[2], b[2]) * 2 + Integer.compare(a[1], b[1]));
            
            while(k > 1){
//            	if(dic[0][2] < dic[1][2] && dic[0][1] < dic[1][1]){
//            		k -= s.length() - dic[0][0] + 1;
//            		dic[0][2] = 0;
//            		dic[0][1] = 200;
//            		Arrays.sort(dic, (a, b) -> Integer.compare(a[2], b[2]) * 2 + Integer.compare(a[1], b[1]));
//            	}
            	
            	temp = dic[0][1];
            	temp2 = dic[0][2];
            	j = 1;
            	if(dic[0][0] == s.length()-1){
            		dic[0][2] = 1;
            	}else{
            		dic[0][1] = s.charAt(++dic[0][0]);
            		dic[0][2]--;
            	}
            	
            	while(j < s.length() && dic[j][2] == temp2 && dic[j][1] == temp){
            		if(dic[j][0] == s.length()-1){
            			dic[j][2] = 1;
            		}else{
            			dic[j][1] = s.charAt(++dic[j][0]);
            			dic[j][2]--;
            		}
            		j++;
            	}
            	k--;
            	Arrays.sort(dic, (a, b) -> Integer.compare(a[2], b[2]) * 2 + Integer.compare(a[1], b[1]));
            }

            System.out.println(s.substring(dic[0][3], dic[0][0] + 1));
            sc.close();
        }
    }
	