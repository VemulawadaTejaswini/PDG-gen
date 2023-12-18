import java.util.Scanner;
import java.util.ArrayList;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  ArrayList<Integer> judge = new ArrayList<Integer>();
  ArrayList<Integer> num=new ArrayList<Integer>();
  ArrayList<String> color=new ArrayList<String>();
  int n=sc.nextInt();
  for(int h=0;h<n;h++){
  int counter=0;
   for(int j=0;j<9;j++){
    num.add(sc.nextInt());
   }
   for(int j=0;j<9;j++){
    color.add(sc.next());
  }

   //The condition whitch judge is 0 or 1
   for(int i=0;i<7 ;i++){
     for(int j=i+1;j<8;j++){
       for(int k=j+1;k<9;k++){
       if(color.get(i).equals(color.get(j))&&color.get(i).equals(color.get(k))){
         if((num.get(i)==num.get(j)&&num.get(i)==num.get(k))||(num.get(i)+1==num.get(j)&&num.get(j)+1==num.get(k))||(num.get(i)+1==num.get(j)&&num.get(j)+1==num.get(k))||(num.get(i)+1==num.get(k)&&num.get(k)+1==num.get(j))||(num.get(j)+1==num.get(i)&&num.get(i)+1==num.get(k))||(num.get(j)+1==num.get(k)&&num.get(k)+1==num.get(i))||(num.get(k)+1==num.get(i)&&num.get(i)+1==num.get(j))||(num.get(k)+1==num.get(j)&&num.get(j)+1==num.get(i)))
        {  counter++;
          num.set(i,-10);
          num.set(j,-10);
          num.set(k,-10);
        }
        }
       }
       }
     }
   if(counter==3)
    judge.add(1);
   else
    judge.add(0);
   num.clear();
   color.clear();
  }
for(int j=0;j<n;j++){
  System.out.println(judge.get(j));
}
 }
}