import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        int k = sc.nextInt();
      int tintin=b-a;
        // 文字列の入力
   
  List<Integer> list = new ArrayList<Integer>();
  
      
      if(b-a-1+2>=k*2){
 		 for(int i=0;i<k;i++){
  		  list.add(a+i);
		}
  
		  for(int i=0;i<k;i++){
 		 	list.add(b-k+1+i);
 		 }
      }else{
      for(int i=0;i<=tintin;i++){
      	list.add(a+i);
      	}
      }
 
      for (Integer unti: list){
  System.out.println(unti);
}
      
	}
}