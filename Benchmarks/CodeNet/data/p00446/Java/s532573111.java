import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			ArrayList<Integer> taro = new ArrayList<Integer>(n);
			ArrayList<Integer> hanako = new ArrayList<Integer>(n);
			
			for(int i = 0; i < n; i++){
				taro.add(sc.nextInt());
			}
			
			Collections.sort(taro);
			
			for(int i = 1; i <= 2*n; i++){
				if(!taro.contains(i)){
					hanako.add(i);
				}
			}
			
			
			
			int cur = -1;
			int taro_p = 0, hanako_p = 0;
			while(!taro.isEmpty() && !hanako.isEmpty()){
				if(!taro.isEmpty() && !hanako.isEmpty()){
					if(cur == -1){
						int ret = taro.remove(0);
						cur = ret;
					}else{
						int ret = Collections.binarySearch(taro, cur);
						if(ret >= 0){
							if(ret != (taro.size() - 1)){
								int tmp = taro.remove(ret + 1);
								cur = tmp;
							}else{
								cur = -1;
							}
						}else{
							ret = -ret - 1;
							if(ret != taro.size()){
								int tmp = taro.remove(ret);
								cur = tmp;
							}else{
								cur = -1;
							}
						}
						
					}
				}else{
					break;
				}
				
				if(!taro.isEmpty() && !hanako.isEmpty()){
					if(cur == -1){
						int ret = hanako.remove(0);
						cur = ret;
					}else{
						int ret = Collections.binarySearch(hanako, cur);
						if(ret >= 0){
							if(ret != (hanako.size() - 1)){
								int tmp = hanako.remove(ret + 1);
								cur = tmp;
							}else{
								cur = -1;
							}
						}else{
							ret = -ret - 1;
							if(ret != hanako.size()){
								int tmp = hanako.remove(ret);
								cur = tmp;
							}else{
								cur = -1;
							}
						}
						
					}
				}else{
					break;
				}
				
			}
			
			
			System.out.println(hanako.size());
			System.out.println(taro.size());
			
		}
	}

}