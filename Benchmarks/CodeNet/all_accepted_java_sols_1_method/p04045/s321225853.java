import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
                int a = sc.nextInt();
                int b = sc.nextInt();

		List<String> list = new ArrayList<String>();


		for(int i = 0; i < b; i++){
			list.add(sc.next());
		}

                int f = 0;


           	for(int i = 0; f < 1; i++){
		  for(int j = 0; j < list.size(); j++){
		  	if(String.valueOf(a + i).contains(list.get(j))){
			  break;
			}else if(j == list.size() - 1){
			  System.out.println(a + i);
			  f = 1;
			}
		  }
		}
     }
}              