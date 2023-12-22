import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	ArrayList<Double> list = new ArrayList<Double>();
      	list.add((double)(sc.nextInt()));
      	for(int i=1;i<n;i++){
        	double a = (double)(sc.nextInt());
          	for(int j=0;j<=list.size();j++){
              	if(list.size()==j){
                	list.add(a);
                  	break;
                }
            	if(a<list.get(j)){
                	list.add(j,a);
                  	break;
                }
            }
        }
      	while(list.size()!=1){
          double a = list.get(0);
          double b = list.get(1);
          list.remove(0);list.remove(0);
          list.add(0,(a+b)/2);
        }
      	System.out.println(list.get(0));
    }
}