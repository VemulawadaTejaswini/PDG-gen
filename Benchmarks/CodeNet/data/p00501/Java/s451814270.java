import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String store = scan.next();
		String x;
		int cnt = 0, sa = 0, store2 = 0; 

		for(int i = 0; i < N; i++){
			x = scan.next();
			a:	for(int j = 0; j < x.length(); j++){
				if(x.charAt(j) == store.charAt(0)){   //看板名と店名の１文字目の一致
					for(int k = j+1; k < x.length(); k++){   
						if(x.charAt(k) == store.charAt(1)){   //看板名と店名の２文字目の一致
							sa = k-j;   //文字の差
							store2 = 2;
							for(int l = k+sa; l < x.length(); l = l+sa){   //差の分増やしながら
								if(x.charAt(l) == store.charAt(store2)){   //看板名と店名の３文字目以降の一致
									if(store2 == store.length()-1){   //strを最後まで確認でできたか
										cnt++;
										break a; 
									}
									store2++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}
}