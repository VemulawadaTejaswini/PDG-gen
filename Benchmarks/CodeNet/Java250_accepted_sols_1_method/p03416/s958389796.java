import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int A = sc.nextInt();
  int B = sc.nextInt();
  int count = 0;
  int[] d = new int[5];
  for(int i = A;i<=B;i++){
    d[0] = i/10000;
    d[1] = (i%10000)/1000;
    d[2] = (i%1000)/100;
    d[3] = (i%100)/10;
    d[4] = i%10;
    if(d[0] == d[4]&& d[1] == d[3]){count += 1;}
  }
    System.out.println(count);
}
}
      
    
