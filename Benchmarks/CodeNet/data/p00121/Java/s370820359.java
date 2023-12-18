

import java.util.*;

public class Main {
static final int[] dir={1,-1,4,-4};
static Map<String,Integer> m=new HashMap<String,Integer>();
static void bfs(){
	String s="01234567";
	m.put(s,0);
	Queue<String> que=new LinkedList<String>();
	que.offer(s);
	while(!que.isEmpty()){
		String tmp=que.poll();
		int step=m.get(tmp);
		//謇セ蛻ー'0'
		int index=-100;
		for(int i=0;i<8;i++)
			if(tmp.charAt(i)=='0') index=i;
		//遘サ蜉ィ'0'
		for(int i=0;i<4;i++){
			if((index==3&&dir[i]==1)||(index==4&&dir[i]==-1)) continue;
			int newindex=index+dir[i];
			if(newindex>=0&&newindex<8){
				//莠、謐「
				StringBuffer sss=new StringBuffer(tmp);
				sss.setCharAt(index, tmp.charAt(newindex));
				sss.setCharAt(newindex, tmp.charAt(index));
				//System.out.println(tmp+"  "+sss.toString());
				String tmp1=sss.toString();
				//譛ェ蜃コ邇ー鬘コ蠎擾シ悟?髦?				if(m.get(tmp1)==null){
					m.put(tmp1,step+1);
					que.offer(tmp1);
				}
			}
		}
	}
}
public static void main(String[] args){
	bfs();
	String input=null;
	Scanner scan=new Scanner(System.in);
	while((input=scan.nextLine()).length()>7){
		input=input.replace(" ","");
		System.out.println(m.get(input));
	}
	scan.close();
}
}