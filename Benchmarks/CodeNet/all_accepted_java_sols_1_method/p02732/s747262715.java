import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a=new int[n];
		Map<Integer,Long> group=new HashMap<>();
		for(int i=0;i<n;i++){
			a[i]= sc.nextInt();
			Long x=group.get(a[i]);
			if(x==null){
				group.put(a[i],(long)1);
			}else{
				group.put(a[i],x+1);
			}
		}
      	long all=0;
      	for(Integer key:group.keySet()){
          long v=group.get(key);
          all+=v*(v-1)/2;
        }  
		for(int i=0;i<n;i++){
			System.out.println(all-group.get(a[i])+1);
		}
		
	}
}
