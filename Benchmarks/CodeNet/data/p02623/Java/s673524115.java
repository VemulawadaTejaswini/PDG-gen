import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		int n = sc.nextInt();
		int m = sc.nextInt();
      	int k = sc.nextInt();
      	int sum = 0 ;
      	int j;
		ArrayList<Integer> a = new ArrayList<>();
      	ArrayList<Integer> b = new ArrayList<>();
      
      	for(int i = 0; i < n ; i++){
        	a.add(sc.nextInt());
        }
        for(int i = 0; i < m ; i++){
            b.add(sc.nextInt());
        }
      
      	for(j= 0; sum < k; j++){
          	if(a.size()==0&&b.size()==0){
              break;
            }else if(a.size()==0 && b.size()!=0){
              if(b.get(0) >= k){
              	break;
              }else{
                sum += b.get(0);
                b.remove(0);
              }
            }else if(a.size()!=0 && b.size()==0){
              if(a.get(0) >= k){
              	break;
              }else{
                sum += a.get(0);
                a.remove(0);
              }
              
            }else if(a.get(0) >= b.get(0)){
              if(a.get(0) >= k){
              	break;
              }else{
                sum += a.get(0);
                a.remove(0);
              }
            }else{
            	if(b.get(0) >= k){
              	break;
              }else{
                sum += b.get(0);
                b.remove(0);
              }
            }
        }
			System.out.println(j);
		
	}
}