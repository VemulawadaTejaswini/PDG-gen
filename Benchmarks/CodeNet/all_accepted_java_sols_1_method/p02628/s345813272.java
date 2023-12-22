import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int k = sc.nextInt();
      	ArrayList<Integer> p = new ArrayList<Integer>();
		ArrayList<Integer> min = new ArrayList<Integer>();
      for(int i=0;i<n;i++){
      	p.add(sc.nextInt());}
      int plen = p.size();
      for(int i = 0;i<plen;i++){
        int minint=p.get(0);
        for(int j = 0;j<p.size();j++){
        	if(p.get(j)<minint){
            		minint=p.get(j);
            		}
        		}
        	min.add(minint);
        	int num = p.indexOf(minint);
        	p.remove(num);
      	}
      int ans=0;
      for(int i=0;i<k;i++){
        ans=ans+min.get(i);
      }
      System.out.println(""+ans);
	}
}