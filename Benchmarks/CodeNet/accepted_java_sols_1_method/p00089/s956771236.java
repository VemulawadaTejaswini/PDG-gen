import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] before = null;
		while(true){
			if(!sc.hasNext()){break;}
			
			String str[] = sc.next().split(",");
			int[] inner = new int[str.length];
			for(int i = 0; i < str.length; i++){
				inner[i] = Integer.parseInt(str[i]);
			}
			
			if(before == null){
				before = inner;
			}else{
				int[] tmp = new int[inner.length];
				for(int i = 0; i < before.length; i++){
					if(i < tmp.length){
						if(tmp[i] < before[i] + inner[i]){
							tmp[i] = before[i] + inner[i];
						}
					}
					
					if(before.length > tmp.length){
						if ((i - 1) < tmp.length && (i - 1) >= 0) {
							if (tmp[i - 1] < before[i] + inner[i - 1]) {
								tmp[i - 1] = before[i] + inner[i - 1];
							}
						}
					}else{
						if ((i + 1) < tmp.length) {
							if (tmp[i + 1] < before[i] + inner[i + 1]) {
								tmp[i + 1] = before[i] + inner[i + 1];
							}
						}
					}
				}
				before = tmp;
			}
		}	
		
		System.out.println(before[0]);
	}
}