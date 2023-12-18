import java.util.*;
public class Main{
	public static HashMap<String,Integer> puzzle;
    public static int[] moves={1,-1,4,-4};
    public static HashMap<String,Integer> solve(){
        Queue<String> q = new ArrayDeque<String>();
        puzzle = new HashMap<String,Integer>();
        puzzle.put("01234567",0);
        q.offer("01234567");
        while(q.size()>0){
            String x=q.poll();
            int z_ind=x.indexOf("0");
            for(int i=0;i<4;i++){
                int z=z_ind+moves[i];
				if((i==1&&(z_ind==0||z_ind==4))||(i==0&&(z_ind==3||z_ind==7))||z<0||z>7){
					continue;
				}
                char[] ch=x.toCharArray();
                char tmp=ch[z_ind];
                ch[z_ind]=ch[z];
                ch[z] = tmp;
                String s = String.valueOf(ch);
                if(puzzle.containsKey(s))continue;
                puzzle.put(s,puzzle.get(x) + 1);
                q.offer(s);
            }
        }
		return puzzle;
	}		
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> puzzle=solve();
		while(sc.hasNext()){
			String unsolved="";
			for(int i=0;i<8;i++){
				unsolved+=sc.next();
			}
			System.out.println(puzzle.get(unsolved));
		}
	}
}
