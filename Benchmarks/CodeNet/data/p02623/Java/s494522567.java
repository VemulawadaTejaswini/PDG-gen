import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		int n = sc.nextInt();
		int m = sc.nextInt();
      	int k = sc.nextInt();
      	int sum = 0 ;
      	int j = 0;
		ArrayList<Integer> a = new ArrayList<>();
      	ArrayList<Integer> b = new ArrayList<>();
      
      	for(int i = 0; i < n ; i++){
        	a.add(sc.nextInt());
        }
        for(int i = 0; i < m ; i++){
            b.add(sc.nextInt());
        }
      	for(int i = 0; sum <= k ; i++){
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
              
            }else if(a.get(0) <= b.get(0)){
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
          if(sum <= k){
          j +=1;
          }else{
          	break;
          }
        }
			System.out.println(j);
		
	}
}