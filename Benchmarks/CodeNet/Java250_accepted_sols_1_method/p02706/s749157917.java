import java.util.*;

public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  
// 整数の入力
int days = sc.nextInt();
int homeworks = sc.nextInt();
int sum = 0;
int temp =0;
  for (int i=0;i<homeworks;i++){
  temp = sc.nextInt();
    sum += temp;
  }
  
  int result = days- sum;
  if (result < 0){
  result = -1;
  }
System.out.println(result);
}
}