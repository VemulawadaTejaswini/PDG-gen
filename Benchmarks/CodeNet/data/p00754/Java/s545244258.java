import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String passage;
  char[] ch;
  Deque<Integer> ad=new ArrayDeque<Integer>();
  int judge;
  do{
  judge=0;
  passage = sc.nextLine();
  for(int i=0;i<passage.length();i++){
    if(passage.charAt(i)=='(')
    ad.offerFirst(1);
    if(passage.charAt(i)==')'){
    if(ad.peekLast()==1&&ad.peekLast()!=null) ad.pollLast();
    else judge=1;}
    if(passage.charAt(i)=='[')
    ad.offerFirst(2);
    if(passage.charAt(i)==']'){
    if(ad.peekLast()==2&&ad.peekLast()!=null) ad.pollLast();
    else judge=1;}
  }

  if(!passage.equals(".")) {
  if(ad.peekFirst()==null&&judge==0) System.out.println("yes");
  else System.out.println("no");
  }

  ad.clear();
  }while(!passage.equals("."));

}
}