import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	int N = sc.nextInt();
 	int cnt = 0;	

  	for (int i=N;i>0;i--){
      if(((0<i)&&(i<10))
         ||((99<i)&&(i<1000))
         ||((9999<i)&&(i<100000))){
         cnt++;
      }
    }
 
  	System.out.println(cnt);
  
	}
}