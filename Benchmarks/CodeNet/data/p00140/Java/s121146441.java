import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] b = new int[]{5,4,3,2,1,0,1,2,3,4,5,6,7,8,9};
		int n = sc.nextInt();
		int x, y;
		int z = 0;
		boolean flag = false;
		
		for(int i=0;i<n;i++){
			x = sc.nextInt();
			y = sc.nextInt();
			flag = false;
			z = 0;
			ArrayDeque<Integer> listA = new ArrayDeque<Integer>();
			ArrayDeque<Integer> listB = new ArrayDeque<Integer>();
			for(int j=0;;j++){
				if(flag==true && b[j]==y){
					listA.add(b[j]);
					break;
				}
				if(flag==false && b[j]==x){
					flag = true;
					z = j;
				}
				if(flag==true) listA.add(b[j]);
				if(j==14) j = -1;
			}

			if(x>0 && x<6){
				flag = false;
				for(int j=0;;j++){
					if(flag==true && b[j]==y){
						listB.add(b[j]);
						break;
					}
					if(flag==false && j!=z && b[j]==x) flag = true;
					if(flag==true) listB.add(b[j]);
					if(j==14) j = -1;
				}
			}
			
			if(listB.size()==0 || listB.size()>listA.size()){
				while(listA.size()>1){
					System.out.print(listA.pop() + " ");
				}
				System.out.println(listA.pop());
			}else{
				while(listB.size()>1){
					System.out.print(listB.pop() + " ");
				}
				System.out.println(listB.pop());
			}
		}
	}	
}