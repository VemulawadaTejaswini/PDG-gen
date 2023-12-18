import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		long n = sc.nextLong();
		long m = sc.nextLong();
      	long k = sc.nextLong();
      	long sum = 0 ;
      	long j = 0;
		ArrayList<Long> a = new ArrayList<>();
      	ArrayList<Long> b = new ArrayList<>();
      
      	for(int i = 0; i < n ; i++){
        	a.add(sc.nextLong());
        }
        for(int i = 0; i < m ; i++){
            b.add(sc.nextLong());
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