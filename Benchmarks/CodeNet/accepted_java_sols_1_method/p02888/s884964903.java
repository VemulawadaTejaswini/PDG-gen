import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();

		int d1[] = new int[n1];

		for(int i = 0; i < n1; i++){
			d1[i] = sc.nextInt();	
		}

		Arrays.sort(d1);

		int r1 = 0;
		for(int i1 = 0; i1 < n1 - 2; i1++){
			for(int i2 = 0; i2 < n1 - i1 - 1; i2++){
				for(int i3 = 0; i3 < n1 - i1 - i2 - 2; i3++){
					if (d1[i1] < d1[i2 + i1 + 1] + d1[i1 + i2 + i3 + 2]){
                		if (d1[i2 + i1 + 1] < d1[i1] + d1[i1 + i2 + i3 + 2]){
                    		if (d1[i1 + i2 + i3 + 2] < d1[i1] + d1[i2 + i1 + 1]){
                        		r1++;
							} else{
								break;
							}
						}
					}
				}
			}
		}
		System.out.println(r1);			
	}
}