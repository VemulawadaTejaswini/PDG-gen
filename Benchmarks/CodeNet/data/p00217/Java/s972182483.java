import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,num;
		HashMap<Integer,Integer> hm;
		int[] distance;
		
		while(true){
			n = sc.nextInt();
			if(n == 0){
				break;
			}
			
			distance = new int[n];
			hm = new HashMap<>();
			for(int i=0;i<n;i++){
				num = sc.nextInt();
				distance[i] = sc.nextInt()+sc.nextInt();
				hm.put(distance[i],num);
			}
			Arrays.sort(distance);
			System.out.println(hm.get(distance[n-1])+" "+distance[n-1]);
		}
	}
}