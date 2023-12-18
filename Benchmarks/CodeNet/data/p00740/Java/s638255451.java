mport java.util.Scanner;
import java.util.ArrayList;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=1,p=1,judge=0;
  ArrayList<Integer> mayor =new ArrayList<Integer>();
  for(int i=0;i<50;i++){
   mayor.add(i,0);
  }
  ArrayList<Integer> winner =new ArrayList<Integer>();
  int k=0;
  while(n!=0||p!=0){
  n=sc.nextInt();
  p=sc.nextInt();
  for(int i=0;i<n;i++){
   mayor.set(i,0);
  }
  while(judge!=n-1){
   for(int i=0;i<n;i++){
    judge=0;
    if(p>0){
     p--;
    mayor.set(i,mayor.get(i)+1);
   }else{
    p+=mayor.get(i);
    mayor.set(i,0);
   }
   if(mayor.get(i)!=0){
   for(int j=0;j<n;j++){
    if(mayor.get(j)==0)
    judge++;
  }
  }
   if(judge==n-1){
    winner.add(k,mayor.get(i));
    break;
    }
   }
   }
   k++;
  }

  for(int j=0;j<k;j++){
   System.out.println(winner.get(j));
  }
 }
 }