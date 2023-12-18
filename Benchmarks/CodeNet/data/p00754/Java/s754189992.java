import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Balance{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String passage;
  char[] ch;
  Deque<Integer> ad=new ArrayDeque<Integer>();
  do{
  passage = sc.nextLine();
  ad.addFirst(0);

  for(int i=0;i<passage.length();i++){
    if(passage.charAt(i)=='(')
    ad.addFirst(1);
    if(passage.charAt(i)==')'&&ad.getFirst()==1)
    ad.removeFirst();
    if(passage.charAt(i)=='[')
    ad.addLast(2);
    if(passage.charAt(i)==']'&&ad.getLast()==2)
    ad.removeLast();
  }

  if(!passage.equals(".")) {
  if(ad.getFirst()==0&&ad.getLast()==0) System.out.println("yes");
  else System.out.println("no");
  }

  ad.clear();
  }while(!passage.equals("."));

}
}