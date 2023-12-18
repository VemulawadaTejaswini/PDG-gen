import java.util.Scanner;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();

  int box[] = new int[a];
  for(int i=0;i<a;i++){
    box[i] = sc.nextInt();
  }
  int m = 1000000007;
  long total = 0;
  int sum = 0;
   
  for(int i=0;i<a;i++){
    sum +=box[i];
    sum %= m;
  }
  
  for(int i=0;i<a;i++){
    sum -= box[i];
    if(sum<0) sum += m;
    
    total += box[i]*sum;
    total %= m;
  }
System.out.println(total);
  
}
}