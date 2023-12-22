import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out, true);
		String str[]=in.nextLine().split(" ");
		int n=Integer.parseInt(str[0]);
		int q=Integer.parseInt(str[1]);
		HashMap<String, Integer> map=new HashMap<>();
		Queue<String> queue=new LinkedList<>();
		for(int i=0;i<n;i++){
			str=in.nextLine().split(" ");
			String pid=str[0];
			int ptime=Integer.parseInt(str[1]);
			map.put(pid, ptime);
			queue.add(pid);
		}
		int time=0;
		ArrayList<String> list=new ArrayList<>();
		HashMap<String, Integer> map_2=new HashMap<>();
		
		while(true){
		       String pid=queue.poll();
		       int ptime=map.get(pid);
		       time+=Math.min(q, ptime);
		       ptime=Math.max(0, ptime-q);
		       map.put(pid, ptime);
		       if(ptime==0){
			       list.add(pid);
			       map_2.put(pid, time);
			       if(list.size()==n)
				       break;
		       }else{
			       queue.add(pid);
		       }
		}
		for(int i=0;i<list.size();i++){
			out.println(list.get(i)+" "+map_2.get(list.get(i)));
		}
	}

}
