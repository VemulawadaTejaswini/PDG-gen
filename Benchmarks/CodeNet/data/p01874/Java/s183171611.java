
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new P().doIt();
    }
    class P{
    	ArrayList<PriorityQueue<Dist>> allqueue = new ArrayList<PriorityQueue<Dist>>();
    	ArrayList<Par> array = new ArrayList<Par>();
    	boolean node[] = new boolean[5001];
    	Point2D p[] = new Point2D[5001];
    	void ADD(int N,Par p1){
    		PriorityQueue<Dist> queue = new PriorityQueue<Dist>();
    		for(int i = 0;i < N;i++){
    			if(!node[i]){
    				queue.add(new Dist(distanceSP(new Line2D.Double(p[p1.g],p[p1.s]),p[i]),i));
    			}
    		}
    		allqueue.add(queue);
    	}
    	void REMOVE(int length){
    		PriorityQueue<Dist> queue = new PriorityQueue<Dist>();
    		for(int i = 0;i < length;i++){
    			queue = allqueue.get(i);
    			for(int j = 0;j < queue.size();j++){
    				Dist q = queue.peek();
    		    	if(!node[q.to]){
    		    		allqueue.set(i, queue);
    		    		break;
    		    	}
    		    	queue.poll();
    			}
    		}
    	}
    	private double distanceSP(Line2D l, Point2D p){
    	    return l.ptSegDist(p);
    	}
        void doIt() { 
        	int N = sc.nextInt()+1;
        	int M = sc.nextInt();
        	for(int i = 0;i < N;i++){
        		p[i] = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
        	}
        	double sum = Integer.MAX_VALUE;
        	Par p1 = new Par(0,0);
        	for(int i = 1;i < N;i++){
        		if(sum > p[0].distance(p[i])){
        			sum = p[0].distance(p[i]);
        			p1 = new Par(0,i);
        		}
        	}
        	for(int i = 1;i < M;i++){
//        		System.out.println(sum);
        		node[p1.s] = true;node[p1.g] = true;
//        		for(int j = 0;j < N;j++)System.out.print(node[j]+" ");
//        		System.out.println();
        		array.add(p1);
        		ADD(N,p1);
        		REMOVE(allqueue.size());
        		double MaxDist = Integer.MAX_VALUE;
        		int temp = 1000;
        		for(int j = 0;j < array.size();j++){
        			Dist d = allqueue.get(j).peek();
//        			System.out.print(d.dist+" ");
        			if(MaxDist > d.dist){
            			MaxDist = d.dist;
            			p1 = array.get(j);
            			temp = d.to;
            		}else if(MaxDist == d.dist){
            			if(temp > d.to){
            				temp = d.to;
            			}
            			if(Math.min(p1.s, p1.g) > Math.min(array.get(j).s,array.get(j).g)){
            				p1 = array.get(j);
            			}
            		}
        		}
//        		System.out.println("node:"+p1.s+" "+p1.g+" "+temp);
        		double distA = p[p1.s].distance(p[temp]);
        		double distB = p[p1.g].distance(p[temp]);
        		if(distA < distB){
        			p1 = new Par(p1.s,temp);
        			sum = sum + distA;
        		}else if(distA == distB){
        			p1 = new Par(Math.min(p1.s,p1.g),temp);
        			sum = sum + distA;
        		}else{
        			p1 = new Par(p1.g,temp);
        			sum = sum + distB;
        		}
        	}
        	System.out.println(sum);
        }
        class Par{
    		int s,g;
    		public Par(int s,int g){
    			this.s = s;
    			this.g = g;
    		}
    	}
    	class Dist implements Comparable<Dist>{
    		double dist;
    		int to;
    		public Dist(double dist,int to){
    			this.dist = dist;
    			this.to = to;
    		}
    		public int compareTo(Dist o){
    			if(dist < o.dist)return -1;
    			else if(dist == o.dist)return 0;
    			else return 1;
    		}
    	}
    }
}