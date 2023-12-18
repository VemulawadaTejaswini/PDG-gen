import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String ground = scan.next();
		int[] height = new int[ground.length()+1];
		height[0] = 0;
		int now = 0;
		int[] valley = new int[(ground.length()/2)+1];
		int status = 0;
		int j = 0;
		int cnt = 0;
		for(int i = 0; i < ground.length(); i++){
			char c = ground.charAt(i);
			switch(c){
			case '\\':
				if(cnt == 0){
					valley[j] = 0;
					status = -1;
					j++;
					cnt++;
				}else if(status > 0){
					if(j != 0){
						if(height[valley[j - 1]] < now && j > 1){
							int k = j - 2;
							int max = height[valley[j - 1]];
							int maxk = j - 1;
							while(k >= 0){
								if(height[valley[k]] > max){
									max = height[valley[k]];
									maxk = k;
									if(max >= now){
										break;
									}
								}
								k--;
							}
							valley[maxk + 1] = status;
							j = maxk + 2;
						}else{
							valley[j] = status;
							j++;
						}
						status = -(i + 1);
					}else{
						valley[j] = status;
						status = -(i + 1);
						j++;
					}
				}
				now--;
				height[i+1] = now;
				break;
				case '/':
				if(cnt == 0){
					status = 1;
					cnt++;
				}else if(i == ground.length() - 1 && j != 0){
					if(height[valley[j - 1]] < now && j > 1){
						int k = j - 2;
						int max = height[valley[j - 1]];
						int maxk = j - 1;
						while(k >= 0){
							if(height[valley[k]] > max){
								max = height[valley[k]];
								maxk = k;
								if(max >= now){
									break;
								}
							}
							k--;
						}
						if(status > 0){
							valley[maxk + 1] = status + 1;
						}else{
							valley[maxk + 1] = 1 - status;
						}
						j = maxk + 2;
					}else{
						if(status > 0){
							valley[j] = status + 1;
						}else{
							valley[j] = 1 - status;
						}
						j++;
					}
					status = -(i + 1);
				}else{
					status = i + 1;
				}
				now++;
				height[i+1] = now;
				break;
			case '_':
				if(i == ground.length() - 1 && status > 0 && j > 0){
					if(height[valley[j - 1]] < now && j > 1){
						int k = j - 2;
						int max = height[valley[j - 1]];
						int maxk = j - 1;
						while(k >= 0){
							if(height[valley[k]] > max){
								max = height[valley[k]];
								maxk = k;
								if(max >= now){
									break;
								}
							}
							k--;
						}
						valley[maxk + 1] = status;
						j = maxk + 2;
					}else{
						valley[j] = status;
						j++;
					}
				}
				height[i+1] = now;
				break;
			}
		}
		
		int A = 0;
		int k = 0;
		if(j > 1){
			k = j - 1;
			int[] L = new int[k];
			for(int i = 0; i < k; i++){
				L[i] = 0;
			}
			int lower;
			int i = 1;
			while(i < j){
				if(height[valley[i - 1]] > height[valley[i]]){
					lower = height[valley[i]];
				}else{
					lower = height[valley[i - 1]];
				}
				
				for(int l = valley[i - 1]; l < valley[i]; l++){
					if(height[l] >= lower && height[l + 1] >= lower){
						continue;
					}else{
						L[i - 1] += ((lower - height[l]) + (lower - height[l + 1]));
					}
				}
				L[i - 1] /= 2;
				A += L[i - 1];
				i++;
			}
			
			System.out.println(A);
			System.out.print(k);
			for( i = 0; i < k; i++){
				System.out.print(" "+L[i]);
			}
			System.out.println("");
		}else{
			System.out.println(A);
			System.out.println(k);
		}
	}
}
