import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long count = Long.parseLong(sc.next());
      	long suuzi = 1;
      	final long limit = 1000000000000000000L;
      	boolean flg = false;
      	for (int i=0; i<count; i++){
          	long item = Long.parseLong(sc.next());
          	if (item == 0){
              System.out.println("0");
              return;
            }
          	if (item <= limit/suuzi){
          		suuzi = item * suuzi;
            }else{
             	flg = true; 
            }
        }
        
      	if(flg && suuzi != 0){
          	suuzi = -1;
        }
      	System.out.println(suuzi);
    }

}