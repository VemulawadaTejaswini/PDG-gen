import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int  max = 1;
    HashMap<String, Integer> tm = new HashMap<String,Integer>();
    List<String>keyList =new ArrayList<String>();
     
	for(int i =0; i<N; i++){
      String s = sc.next();
        if(tm.containsKey(s) == true){
           int number = tm.get(s) + 1;  //該当キーの値を１増やす準備
           tm.replace(s, number);
           if(max < number) max = number;
        }else{
           tm.put(s, 1);
           keyList.add(s);
        }
    }
    
    Collections.sort(keyList);
    
    for(int i=0; i<keyList.size(); i++){
      String s = keyList.get(i);
      int number = tm.get(s);
      if(number == max)
        System.out.println(s);
    }
    
  }
}
