import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  sc.useDelimiter(".");
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
    else if(passage.charAt(i)==')'){
    if(ad.peekLast()!=null&&ad.peekFirst()==1) ad.pollFirst();
    else if(ad.peekLast()==null||ad.peekFirst()!=1) judge=1;}
    else if(passage.charAt(i)=='[')
    ad.offerFirst(2);
    else if(passage.charAt(i)==']'){
    if(ad.peekLast()!=null&&ad.peekFirst()==2) ad.pollFirst();
    else if(ad.peekLast()==null||ad.peekFirst()!=2) judge=1;}
  }

  if(!passage.equals(".")) {
  if(ad.peekFirst()==null&&judge==0) System.out.println("yes");
  else System.out.println("no");
  }

  ad.clear();
  }while(!passage.equals("."));

}
}