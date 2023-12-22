import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	HashMap<String,Integer> hm=new HashMap<>();
      	while(n--!=0){
        String str=sc.next();
          if(hm.containsKey(str)){
          	
          }else{
          	hm.put(str,1);
          }
        }
      System.out.println(hm.size());
    }
}
