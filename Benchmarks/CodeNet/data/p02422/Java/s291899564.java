import java.util.*;
 
class Main{
    public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.next()); //?????????
		int n = scan.nextInt(); //????????????????????°
		int cnt = 0;
		while(cnt < n+1){
			String[] cmd = scan.nextLine().split(" ");
			switch(cmd[0]){
				case "reverse":
					StringBuffer tmpSb = new StringBuffer(sb.substring(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2])+1));
					tmpSb = tmpSb.reverse();
					sb.delete(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2])+1);
					sb.insert(Integer.parseInt(cmd[1]), tmpSb);
					break;
				case "replace":
					sb.delete(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2])+1);
					sb.insert(Integer.parseInt(cmd[1]), cmd[3]);
					break;
				case "print":
					String print = sb.substring(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2])+1);
					System.out.println(print);
					break;
			}
			++cnt;
		}
    }
}