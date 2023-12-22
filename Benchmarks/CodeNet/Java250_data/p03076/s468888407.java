import java.util.*;
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int mindex = 0;
    int sum = 0;
    int[] alist = {a,b,c,d,e};
	int slist[] = new int[5];
    
    for(int i = 0;i < 5;i++){
            if(alist[mindex] % 10 > alist[i] % 10 && alist[i] % 10 != 0 || alist[mindex] % 10 == 0){
              mindex = i;
            }
    }
    
    for(int i = 0;i < 5;i++){
      if(i == mindex || alist[i] % 10 == 0){
        sum+= alist[i];
      }else{
       	sum+= alist[i] / 10 * 10 +10; 
      }
    }
    
    System.out.println(sum);
  }
}