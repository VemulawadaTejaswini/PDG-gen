import java.util.Scanner;
import java.util.ArrayList;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  ArrayList<Integer> code =new ArrayList<Integer>();
  ArrayList<Integer> tmp =new ArrayList<Integer>();
  ArrayList<Integer> initial =new ArrayList<Integer>();
  int a=0,n,r;
do{
  n=sc.nextInt();
  for(int j=0;j<n;j++){
    code.add(j,n-j);
  }
  r=sc.nextInt();
  for(int i=0;i<r;i++){
    int p=sc.nextInt();
    int c=sc.nextInt();
    for(int k=0;k<p+c-1;k++){
      tmp.add(k,code.get(k));
    }
    for(int l=0;l<c;l++){
      code.set(l,tmp.get(p-1+l));
    }
    for(int m=0;m<p;m++){
      code.set(m+c,tmp.get(m));
    }
    }
    initial.add(a,code.get(0));
    a++;
  }while(n!=0||r!=0);
  for(int h=0;h<a-1;h++){
    System.out.println(initial.get(h));
  }
 }
}