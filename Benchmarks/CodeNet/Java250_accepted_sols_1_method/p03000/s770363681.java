import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int x = sc.nextInt();
      	List<Integer> list = new ArrayList<>();
      
      	int count = 1, d = 0;
      	for(int i = 0; i < n; i++){
        	list.add(sc.nextInt());
        } 
      	
      	int temp;
      	for(int i = 1; i <= n; i++){
           	temp = d;
        	d = temp + list.get(i-1);
          	if(d <= x){
            	count++;
            }else{
            	break;
            }
        }
      
      	System.out.println(count);
    }
}