import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int o=0;
        int x=sc.nextInt();
        int y=sc.nextInt();
        PriorityQueue<Integer> q=new PriorityQueue<>();
		for(int i=0;i<y;i++){
        		int p=sc.nextInt();
        		q.add(p);
		}
      	for(int i=0;i<=100;i++){         
          if(!q.contains(x-i)){
          	o=x-i;
            break;
          }else if(!q.contains(x+i)){
          	o=x+i;
            break;
          }
        }  
      System.out.println(o);
    }
    
}