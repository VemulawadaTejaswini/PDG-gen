import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;
/**
 * @author Chen Qiu, email:m5222104@u-aizu.ac.jp
 *@version : 2019/April
 */
public class Main {
		public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        out.flush();
        in.nextToken();
        int nodes_sum,edges_sum,source;
        nodes_sum=(int)in.nval;
        in.nextToken();
        edges_sum=(int)in.nval;
        in.nextToken();
        source=(int)in.nval;
        in.nextToken();
        node[] gh=new node[nodes_sum];
        for (int i = 0; i < nodes_sum; i++) {
			gh[i]=new node(i);
			if (i==source) {
				gh[i].setDistance(0);
			}		
		}       
        for(int i=0;i<edges_sum;i++){ 	
            int a = (int) in.nval;
            in.nextToken();
            int b = (int) in.nval;
            in.nextToken();
            int c = (int) in.nval;
            if(i!=edges_sum-1)
            	in.nextToken();
            gh[a].getSta_list().add(b);
            gh[a].getCost_list().add(c);
        }
        out.flush();
			Dijikstra(gh);	
			for (node ghNode : gh) {
				int temp=ghNode.getDistance();
				if (temp== 1000000000) {
					out.println("INF");
				}else
					out.println(temp);
				out.flush();
			}
		}
		public static void Dijikstra(node[] G) throws InterruptedException {
			PriorityBlockingQueue<node> queue=new PriorityBlockingQueue<node>(G.length,dComparator);
			for (int i = 0; i < G.length; i++) {
				queue.offer(G[i]);
			}
			while (!queue.isEmpty()) {
				node u=queue.take();
				//node u=queue.poll();
				for (int i = 0; i < u.getSta_list().size(); i++) {
					node temp=G[u.getSta_list().get(i)];
					int weight=RELAX(u,temp,i);
					if(queue.remove(temp)) {
						queue.offer(temp);
					}
				}
			}
		}
		public static Comparator<node> dComparator=new Comparator<node>() {
			@Override
			public int compare(node v1,node v2){
				return (int) (v1.getDistance() - v2.getDistance());
			}
		};
		public static int RELAX(node u,node j,int i) {
			int weight=u.getCost_list().get(i);
			int sum=weight+u.getDistance();
			if(j.getDistance()>sum){
				j.setDistance(sum);
				return sum;
			}
			return j.getDistance();
		}
	}
	class node{
		private int name;
		private int distance=1000000000;
		private List<Integer> sta_list=new LinkedList<>();
		private List<Integer> cost_list=new LinkedList<>();
		public node(int name) {
			this.name=name;
		}
		public int getName() {
			// TODO Auto-generated method stub
			return this.name;
		}
		public int getDistance() {
			return distance;
		}
		public void setDistance(int distance) {
			this.distance = distance;
		}
		public List<Integer> getSta_list() {
			return sta_list;
		}
		public void setSta_list(List<Integer> sta_list) {
			this.sta_list = sta_list;
		}
		public List<Integer> getCost_list() {
			return cost_list;
		}
		public void setCost_list(List<Integer> cost_list) {
			this.cost_list = cost_list;
		}
		
	}
