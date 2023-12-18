import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		Map<Integer, Integer> graph = new HashMap<Integer, Integer>();
	 		Set<Integer> no = new HashSet<Integer>();
	 		StringTokenizer st1 = new StringTokenizer(bf.readLine());
	 		ArrayList<Integer> array = new ArrayList<Integer>();
	 		for(int i = 0;i<n;i++){
	 			array.add(Integer.parseInt(st1.nextToken()));
	 			no.add(array.get(i));
	 			if (graph.containsKey(array.get(i))){
	 				graph.put(array.get(i), graph.get(array.get(i))+1);
	 			}
	 			else{
	 				graph.put(array.get(i), 1);
	 			}
	 		}
	 	int removecount = 0;
	 	for(int i : array){
	 		ArrayList<Integer> factors = new ArrayList<Integer>();
	 		for(int j = 1;j*j <= i;j++){
	 			if (i%j == 0){
		 			factors.add(j);
		 			factors.add(i/j);
	 			}
	 		}
	 		for(int j : factors){
	 			if (j!= i && graph.containsKey(j)){
	 				removecount++;
	 				break;
	 			}
	 			else if (j == i && graph.containsKey(j) && graph.get(j) >1){
	 				removecount++;
	 				break;
	 			}
	 		}
	 		
	 	}
	 	out.println(n-removecount);
	 	
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


