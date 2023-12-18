import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		int i = 0;
		
		ArrayList<Integer> fas = new ArrayList<Integer>();
		ArrayList<Integer> has = new ArrayList<Integer>();
		ArrayList<Integer> las = new ArrayList<Integer>();
		int counta=0;
		
		while(true){
			
			while(true){
				try {
					tmp = br.readLine();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				
				if(tmp.equals("")){
					break;
				}
				if(tmp.length() < 2){
					break;
				}
				if(counta > 999){
					break;
				}
				String[] sprit = tmp.split(",",0);
				
				fas.add(Integer.parseInt(sprit[0]));
				counta++;
			}
			
			counta=0;
			
			while(true){
				try {
					tmp = br.readLine();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				
				if(tmp == null){
					break;
				}
				//if(tmp.equals("")){
				//	break;
				//}
				//if(tmp.length() < 2){
					//break;
				//}
				if(counta > 999){
					break;
				}
				
				String[] sprit = tmp.split(",",0);
				
				has.add(Integer.parseInt(sprit[0]));
				counta++;
			}
//			
//			for(i=0;i<fas.size();i++){
//				for(int j=0;j<has.size();j++){
//					
//					if(fas.get(i) == has.get(j)){
//						int k = 0;
//						for(k=0;k<las.size();k++){
//							if(las.get(k) == fas.get(i)){
//								k = 1000000;
//								break;
//							}
//						}
//						if(k != 1000000){
//							las.add(fas.get(i));
//						}
//					}
//					
//				}
//			}
//			
//			Collections.sort(las);
//			
//			
//			int[] las2 = new int[las.size()];
//			
//			for(i=0;i<fas.size();i++){
//				for(int j=0;j<las.size();j++){
//					
//					if(fas.get(i) == las.get(j)){
//						las2[j]++;
//					}
//				}
//			}
//			
//			for(i=0;i<has.size();i++){
//				for(int j=0;j<las.size();j++){
//					
//					if(has.get(i) == las.get(j)){
//						las2[j]++;
//					}
//				}
//			}
//			
//			for(i=0;i<las.size();i++){
//				System.out.println(las.get(i)+" "+las2[i]);
//			}
			
			
		}
		
	}
}