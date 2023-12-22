import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int num = Integer.parseInt(sc.next());
  int[] array = new int[num];
  String ans = "YES";
  for (int i = 0; i < num; i++){
  array[i] = Integer.parseInt(sc.next());
  }
  Arrays.sort(array);
  for (int i = 1; i <num; i++){
  	if(array[i-1] == array[i]){
    ans = "NO";
    }
  }
  System.out.println(ans);
}
}