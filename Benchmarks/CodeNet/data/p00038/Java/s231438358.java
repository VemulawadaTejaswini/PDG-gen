import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int[] n = new int[14];
			int[] m = new int[14];
			
			String s = sc.next();
			
			int start;
			int j=0;
			for(int i=0;i<4;i++){
				start = j;
				while(s.substring(j,j+1).compareTo(",")!=0)j++;
				n[Integer.valueOf(s.substring(start,j))]++;
				j++;
			}
			n[Integer.valueOf(s.substring(j,s.length()))]++;
			
			m = Arrays.copyOf(n,14);
			
			Arrays.sort(m);
			
			if(m[13]==4){
				System.out.println("four card");
			}else if(m[13]==3 && m[12]==2){
				System.out.println("full house");
			}else if(m[13]==3 && m[12]==1){
				System.out.println("three card");
			}else if(m[13]==2 && m[12]==2){
				System.out.println("two pair");
			}else if(m[13]==2 && m[12]==1){
				System.out.println("one pair");
			}else{
				if(n[10]==1 && n[11]==1 && n[12]==1 && n[13]==1 && n[1]==1){
					System.out.println("straight");
				}else{
					boolean flag = true;
					for(int i=1;i<10;i++){
						if(n[i]==1 && n[i+1]==1 && n[i+2]==1 && n[i+3]==1 && n[i+4]==1){
							System.out.println("straight");
							flag = false;
							break;
						}
					}
					if(flag==true){
						System.out.println("null");
					}	
				}
				
			}	
			
		}
	
	}	
}