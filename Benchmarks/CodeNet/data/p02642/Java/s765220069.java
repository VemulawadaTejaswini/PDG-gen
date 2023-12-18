import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int o=0;
        int n=sc.nextInt();
        PriorityQueue<Integer> q=new PriorityQueue<>();
		for(int i=0;i<n;i++){
        		int p=sc.nextInt();
        		q.add(p);
		}
      	ArrayList<Integer> list =new ArrayList<>();
      	for(int i=0;i<n;i++){
        	list.add(q.poll());
		}
      	for(int i=0;i<n;i++){
          	int ai=list.get(i);
          	if(i<n-1&&ai==list.get(i+1)){
            	continue;
            }
          	if(i==0){
            	o++;
              	continue;
            }
          	
        	for(int j=0;j<i;j++){
            	if(ai%list.get(j)==0){
                	break;
                }else if(j>=i-1){
                	o++;
                }
            }
        }
      System.out.println(o);
    }
    
}