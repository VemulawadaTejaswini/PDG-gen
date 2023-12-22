import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args){
      
      	String[] input1;
      	String[] input2;
        
      	try (Scanner sc = new Scanner(System.in)) {
          input1 = sc.nextLine().split(" "); // nextLine:enterまで取得
          input2 = sc.nextLine().split(" ");
        }
      	
      	int n = Integer.parseInt(input1[0]);
        int x = Integer.parseInt(input1[1]);
      
      	List<Integer> list = new ArrayList<>();
      	for (String str : input2) {
         	list.add(Integer.parseInt(str));
        }
		
      	int d = 0;
      	int cnt = 1;
        for (int i = 0; i < list.size(); i++){
        	int e = d + list.get(i);
          
          	if (e <= x) {
              cnt ++;
            }  
          	d = e;
        }
      System.out.println(cnt);
	}
}
