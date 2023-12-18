import java.util.*;

public class Asia1998A{
	public static void main(String[] args){
		int max = (int)(Math.pow(2,15));
		int count=0;
		List<Integer> list = new ArrayList<Integer>(); 
		boolean[] a = new boolean[max];
		for(int i=0;i<max;i++){
			a[i] = true;
		}
		a[0]=false;
		a[1]=false;
		for(int i=2;i<max;i++){
			for(int j=2;j<max;j++){
				if(i*j < max) a[i*j] = false;
			}
		}
		for(int i=0;i<max;i++){
			if(a[i] == true){
				list.add(i);			
			}
		}
		//System.out.print(list);
		for(int i=0;i<max;i++){
			if(args[i].equals("0")) break;
			for(int j=0;j<list.size();j++){
				for(int k=0;k<list.size();k++){
					int first = list.get(j).intValue();
					int second = list.get(k).intValue();
					//System.out.println(first);
					if(first+second == Integer.parseInt(args[i]) && first<=second) count++;
				}
			}
			System.out.println(count);
			count = 0;
		}
	}
}