import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	ArrayList<Integer> list = new ArrayList<>();
      	for(int cnt = 0;cnt < n;cnt++){
        	list.add(Integer.parseInt(sc.next()));
        }
      
      	int money = 1000;
      	int kabu = 0;
      	int max = Collections.max(list);
      	if(max == list.get(0)){
        	System.out.println(1000);
        }else{
          	kabu += money / list.get(0);
          	money -= kabu * list.get(0);
          	int save = list.get(0);
        	for(int cnt = 1;list.get(cnt) != max;cnt++){
            	if(save < list.get(cnt)){
                	money = kabu * list.get(cnt);
                  	kabu = 0;
                  	save = list.get(cnt);
                }else if(money >= list.get(cnt) && save > list.get(cnt)){
                	kabu += money / list.get(cnt);
          			money -= kabu * list.get(cnt);
                  	save = list.get(cnt);
                }
            }
          	System.out.println(kabu * max + money);
        }
    }
}